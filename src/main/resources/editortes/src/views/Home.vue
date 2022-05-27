<template>
  <div class="className"> 
    	<h2>
  		user home user's {{msg}}
  	</h2>
    <transition name="page-transition">
    	<router-view />
    </transition>
  </div>
</template>

<script type="text/javascript">

export default {
  name: "Home",
  data() {
    return {
    	msg: 'home'
    };
  }
};
</script>

<style lang="less" scoped>
  /*动态 效果*/
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
