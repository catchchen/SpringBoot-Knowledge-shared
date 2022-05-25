<template>
  <a-layout :class="['layout', device]">
    <!-- SideMenu 
    <a-drawer
      v-if="isMobile()"
      placement="left"
      :wrapClassName="`drawer-sider ${navTheme}`"
      :closable="false"
      :visible="collapsed"
      @close="drawerClose"
    >-->
      <side-menu
        mode="inline"
        :menus="menus"
        :theme="navTheme"
        :collapsed="false"
        :collapsible="true"
        @menuSelect="menuSelect"
      ></side-menu>
    <!-- </a-drawer> -->
<!--  
    <side-menu
      v-else-if="isSideMenu()"
      mode="inline"
      :menus="menus"
      :theme="navTheme"
      :collapsed="collapsed"
      :collapsible="true"
    ></side-menu>
-->
    <a-layout
      :class="[layoutMode, `content-width-${contentWidth}`]"
      :style="{ paddingLeft: contentPaddingLeft, minHeight: '100vh' }"
    >
      <!-- layout header -->
      <Header
        :mode="layoutMode"
        :menus="menus"
        :theme="navTheme"
        :collapsed="collapsed"
        :device="device"
        @toggle="toggle"
      />

      <!-- layout content -->
      <a-layout-content :style="{ height: '100%', margin: '24px 24px 0', paddingTop: fixedHeader ? '64px' : '0' }">
        <transition name="page-transition">
          <route-view />
        </transition>
      </a-layout-content>

      <!-- layout footer -->
      <a-layout-footer>
        <Footer />
      </a-layout-footer>
    </a-layout>

    <!-- <setting-drawer ref="drawer"></setting-drawer> -->

    <!-- <LoginModal @success="onLoginSucceed" /> -->
  </a-layout>
</template>

<script>
// import { triggerWindowResizeEvent } from '@/utils/util'
// import { mapState, mapActions } from 'vuex'
// import { mixin, mixinDevice } from '@/mixins/mixin'
// import config from '@/config/defaultSettings'
// import { asyncRouterMap } from '@/config/router.config.js'

// import RouteView from './RouteView'
import SideMenu from '@/components/Menu/SideMenu'
import Header from '@/components/Header/Header'
import Footer from '@/components/Footer/Footer'
// import SettingDrawer from '@/components/SettingDrawer/SettingDrawer'
// import LoginModal from '@/components/Login/LoginModal'

export default {
  name: 'Layout',
  components: {
    SideMenu,
    Header,
    Footer,
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
