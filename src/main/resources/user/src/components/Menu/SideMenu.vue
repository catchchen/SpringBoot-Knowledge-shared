<template>
<!-- antd Layout组件中的 siider -->
  <a-layout-sider
    :class="['sider', isDesktop() ? null : 'shadow', theme, fixSiderbar ? 'ant-fixed-sidemenu' : null]"
    width="256px"
    :collapsible="collapsible"
    v-model="collapsed"
    :trigger="null"
  >
    <logo />
    <s-menu
      :collapsed="collapsed"
      :menu="menus"
      :theme="theme"
      :mode="mode"
      @select="onSelect"
      style="padding: 16px 0px;"
    ></s-menu>
  </a-layout-sider>
</template>

<script>
import Logo from '@/components/Tools/Logo'
import SMenu from './index'
import { mixin, mixinDevice } from '@/mixins/mixin'

export default {
  name: 'SideMenu',
  components: { Logo, SMenu },
  mixins: [mixin, mixinDevice],
  props: {
    mode: {
      type: String,
      required: false,
      default: 'inline'
    },
    theme: {
      type: String,
      required: false,
      default: 'dark'
    },
    collapsible: {
      type: Boolean,
      required: false,
      default: false
    },
    collapsed: {
      type: Boolean,
      required: false,
      default: false
    },
    menus: {
      type: Array,
      required: true
    }
  },
  methods: {
    onSelect(obj) {
      // 触发父组件的 menuSelect 方法 并将obj传递
      this.$emit('menuSelect', obj)
    }
  }
}
</script>
