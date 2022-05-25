<template>
<div>
  <!-- 如果是手机 以抽屉的形式展开 东西 -->
  <a-layout class="['layout',device]">
<!-- SideMenu -->
  <a-drawer 
    v-if="isMobile()"
    placement="left"
    :wrapClassName="drawer-side"
    :closable="false"
    :visible="collapsed"
    @close="drawerClose"
  >
  <side-menu
    mode="inline"
    :menus="menus"
    :theme="navTheme"
    :collapsed="false"
    :collapsible="true"
    @menuSelect="menuSelect"
  >
  </side-menu>

  </a-drawer>

    <side-menu
      v-else-if="isSideMenu()"
      model="inline"
      :menus="menus"
      :theme="nvaTheme"
      :collapsed="collapsed"
      :collapsible="true"
    >
    </side-menu>

    <a-layout
    :class="[layoutMode,`content-width-${contentWidth}`]"
    :style="{ paddingLeft: contentPaddingLeft,minHeight: '100vh' }">
      <!-- layout header -->
      <Header />
      <!-- layout content -->
      <a-layout-content :style="{ height: '100%', margin: '24px 24px 0', paddingTop: fixedHeader? '64px' : '0' }">
        <transition name="page-transition">
          <!-- 二级路由 -->
          <route-view />
          <!-- <div>11111111111</div> -->
        </transition>
      </a-layout-content>
      <a-layout-footer>
        <Footer />
      </a-layout-footer>
    </a-layout>

    <!-- <setting-drawer ref="drawer"></setting-drawer> -->

  </a-layout>
</div>
</template>

<script>
// import { triggerWindowResizeEvent } from '@/utils/util'
import { mapState, mapActions } from 'vuex'
import { mixin, mixinDevice } from '@/mixins/mixin'
import config from '@/config/settings'
// import { asyncRouterMap } from '@/config/router.config.js'

import RouteView from './RouteView'
import SideMenu from '@/components/Menu/SideMenu'
import Header from '@/components/Header/Header'
import Footer from '@/components/Footer/Footer'
// import SettingDrawer from '@/components/SettingDrawer/SettingDrawer'
// import LoginModal from '@/components/Login/LoginModal'

export default {
  name: 'Layout',
  mixins:[mixin,mixinDevice],
  components: {
    Header,
    Footer,
    SideMenu,
    RouteView
  },
  data () {
    return {
      product:config.product,
      collapsed: false,
      menus: []
    }
  },
  computed: {
    ...mapState({
      // 动态主路由
      mainMenu: state => state.permission.addRouters
    }),
  },
  methods: {
    ...mapActions(['setSidebar', 'ToggleLoginModal']),
    menuSelect() {
      if (!this.isDesktop()) {
        this.collapsed = false
      }
    },
    drawerClose() {
      this.collapsed = false
    },
  }
}
</script>

<style lang="less">
@import url('../style/global.less');

.page-transition-enter {
  opacity: 0;
}

.page-transition-leave-active {
  opacity: 0;
}

.page-transition-enter .page-transition-container,
.page-transition-leave-active .page-transition-container {
  -webkit-transform: scale(1.1);
  transform: scale(1.1);
}
</style>
