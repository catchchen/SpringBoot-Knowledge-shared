import { Layout, BlankLayout } from "../layouts";
// 导入布局
/**
 * 基础路由
 */
export const constantRouterMap = [
  // {
  //   path: '/login',
  //   name: 'Login',
  //   meta: { title: '登录' },
  //   component: () => import('@/views/user/Login')
  // },
  // {
  //   path: '/password/reset',
  //   name: 'ResetPassword',
  //   meta: { title: '重置密码' },
  //   component: () => import('@/views/user/ResetPassword')
  // },
  {
    path: '/404',
    name: 'NotFound',
    component: () => import('@/views/exception/404')
  }
]
  /**
   * 动态路由
   */
export const asyncRouterMap = [
  {
    path: '/',
    name: 'Layout',
    component: Layout,
    meta: { title: '首页' },
    redirect: '/main',
    children: [
      // main page
      {
        path: '/main',
        name: 'Dashboard',
        component: () => import('@/views/dashboard/Dashboard'),
        meta: { title: '主页面', icon: 'dashboard', hiddenHeaderContent: false, keepAlive: false }
      },

      // posts
      {
        path: '/posts',
        name: 'Posts',
        component: BlankLayout,
        redirect: '/posts/list',
        meta: { title: '文章', icon: 'form' },
        children: [
          {
            path: '/posts/list',
            name: 'PostList',
            component: () => import('@/views/post/PostList'),
            meta: { title: '所有文章', hiddenHeaderContent: false }
          },
          {
            path: '/posts/write',
            name: 'PostWrite',
            component: () => import('@/views/post/PostEdit'),
            // meta: { title: '写文章', hiddenHeaderContent: false, keepAlive: false }
          },
          {
            path: '/posts/edit',
            name: 'PostEdit',
            // hidden: true,
            component: () => import('@/views/post/PostEdit'),
            // meta: { title: '编辑文章', hiddenHeaderContent: false, keepAlive: false }
          },
          // {
          //   path: '/categories',
          //   name: 'CategoryList',
          //   component: () => import('@/views/post/CategoryList'),
          //   meta: { title: '分类目录', hiddenHeaderContent: false }
          // },
          // {
          //   path: '/tags',
          //   name: 'TagList',
          //   component: () => import('@/views/post/TagList'),
          //   meta: { title: '标签', hiddenHeaderContent: false }
          // }
        ]
      },
      // attachments
      // {
      //   path: '/attachments',
      //   name: 'Attachments',
      //   component: () => import('@/views/attachment/AttachmentList'),
      //   meta: { title: '附件', icon: 'picture', hiddenHeaderContent: false }
      // },

      // comments
      // {
      //   path: '/comments',
      //   name: 'Comments',
      //   component: () => import('@/views/comment/CommentList'),
      //   meta: { title: '评论', icon: 'message', hiddenHeaderContent: false }
      // },

      // user
      // {
      //   path: '/user',
      //   name: 'User',
      //   页面展示 
      //   component: PageView,
      //   redirect: '/user/profile',
      //   meta: { title: '用户', icon: 'user' },
      //   children: [
      //     {
      //       path: '/user/profile',
      //       name: 'Profile',
      //       component: () => import('@/views/user/Profile'),
      //       meta: { title: '个人资料', hiddenHeaderContent: false }
      //     }
      //   ]
      // },
    ]
  },
  // {
  //   path: '*',
  //   redirect: '/404',
  //   hidden: true
  // }
]