import VueClipboard from 'vue-clipboard2'
import Vue from 'vue'
import VueStorage from 'vue-ls'
import config from '@/config/settings'

Vue.use(VueStorage, config.storageOptions)
Vue.use(VueClipboard)
