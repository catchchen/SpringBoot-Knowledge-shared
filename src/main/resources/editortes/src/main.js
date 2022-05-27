import Vue from 'vue'
import App from './App.vue'
import router from './router'
// import { haloEditor } from 'halo-editor'

// Vue.component('halo-editor', haloEditor);
Vue.config.productionTip = false

new Vue({
  router,
  render: h => h(App),
}).$mount('#app')
