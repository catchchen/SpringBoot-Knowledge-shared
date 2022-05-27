<template>
  <div class="home"> 
  	<h2>
  		user home user uuuu {{msg}}
  	</h2>
  </div>
</template>

<script type="text/javascript">

export default {
  name: "User",
  data() {
    return {
    	msg: 'user-chenk'
    };
  },
  props: {
  // 相互传递参数
  },
  components: {
  },
  watch: {
  },
  computed: {
  },
  mounted() {
  },
  methods: {
  }
};
</script>

<style lang="less" scoped>

</style>
