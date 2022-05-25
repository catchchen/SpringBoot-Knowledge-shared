<template>
<div>
  <!-- <page-view>
    </page-view> -->
    <h2>JournalPublishCard</h2>
  <journal-publish-card></journal-publish-card>
  <h2>RecentComment</h2>
  <recent-comment-tab></recent-comment-tab>
  <h2>DashBoard</h2>
    <div class="dashboard-text">name:{{ name }}</div>
    <div class="dashboard-text">roles:<span v-for="role in roles" :key="role">{{ role }}</span></div>
</div>
</template>

<script>
// import { PageView } from '@/layouts'
// import AnalysisCard from './components/AnalysisCard'
import JournalPublishCard from './components/JournalPublishCard'
import RecentCommentTab from './components/RecentCommentTab'
// import LogListDrawer from './components/LogListDrawer'

// import postApi from '@/api/post'
// import logApi from '@/api/log'
// import statisticsApi from '@/api/statistics'
export default {
  name: 'Dashboard',
  beforeMount() {
    // this.handleLoadStatistics()
    // this.handleListLatestPosts()
    // this.handleListLatestLogs()
  },
  data () {
    return {
      name: 'main',
      roles: [1,2,3,4,5]
    }
  },
  components: {
    // PageView,
    JournalPublishCard,
    RecentCommentTab
  },
  computed: {
  //   formattedLogDatas() {
  //     return this.latestLogs.map(log => {
  //       log.type = this.logTypes[log.type].text
  //       return log
  //     })
  //   }
  // },
  // destroyed: function() {
  //   if (this.logListDrawerVisible) {
  //     this.logListDrawerVisible = false
  //   }
  // },
  // beforeRouteEnter(to, from, next) {
  //   next(vm => {
  //     vm.interval = setInterval(() => {
  //       vm.handleLoadStatistics()
  //     }, 5000)
  //   })
  // },
  // beforeRouteLeave(to, from, next) {
  //   if (this.interval) {
  //     clearInterval(this.interval)
  //     this.interval = null
  //     this.$log.debug('Cleared interval')
  //   }
  //   if (this.logListDrawerVisible) {
  //     this.logListDrawerVisible = false
  //   }
  //   next()
  },
  methods: {
    handleListLatestPosts() {
      this.activityLoading = true
      // postApi
      //   .listLatest(5)
      //   .then(response => {
      //     this.latestPosts = response.data.data
      //   })
      //   .finally(() => {
      //     setTimeout(() => {
      //       this.activityLoading = false
      //     }, 200)
      //   })
    },
    handleListLatestLogs() {
      this.logLoading = true
      // logApi
      //   .listLatest(5)
      //   .then(response => {
      //     this.latestLogs = response.data.data
      //   })
      //   .finally(() => {
      //     setTimeout(() => {
      //       this.logLoading = false
      //     }, 200)
      //   })
    },
    handleLoadStatistics() {
      // statisticsApi
      //   .statistics()
      //   .then(response => {
      //     this.statisticsData = response.data.data
      //   })
      //   .catch(() => {
      //     clearInterval(this.interval)
      //   })
      //   .finally(() => {
      //     setTimeout(() => {
      //       this.statisticsLoading = false
      //     }, 200)
      //   })
    },
    //postId
    handlePostPreview() {
      // postApi.preview(postId).then(response => {
      //   window.open(response.data, '_blank')
      // })
    },
    handleLogListClose() {
      this.logListDrawerVisible = false
      this.handleListLatestLogs()
    }
  }
}
</script>
