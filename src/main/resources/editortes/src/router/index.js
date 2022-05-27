import Vue from 'vue'
import VueRouter from 'vue-router'
import User from '../views/User.vue'
import Editor from '../views/Editor.vue'
Vue.use(VueRouter)

const routes = [{
    path: '/home',
    name: 'Home',
    component: () => import('@/views/Home.vue'),
    redirect: '/user',
    children: [{
      path: '/user',
      name: 'User',
      component: User
    },
    {
      path: '/editor',
      name: 'editor',
      component: Editor
    }]
  }]
const router = new VueRouter({
	mode: 'history',
	routes
})
export default router
