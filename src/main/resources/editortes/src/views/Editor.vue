<template>
  <div class="editor">
<halo-editor
      v-model="originalContentData"
      :boxShadow="false"
      :toolbars="toolbars"
      :ishljs="true"
      autofocus
      @save="handleSaveDraft"
    />
  </div>
</template>

<script type="text/javascript">
import { haloEditor } from 'halo-editor'
import 'halo-editor/dist/css/index.css'
export default {
  name: "Editor",
  data() {
    return {
    	toolbars:{
    		bold: true, // 粗体
			  italic: true, // 斜体
			  header: true, // 标题
			  underline: true, // 下划线
			  strikethrough: true, // 中划线
			  quote: true, // 引用
			  ol: true, // 有序列表
			  ul: true, // 无序列表
			  link: true, // 链接
			  code: true, // code
			  table: true, // 表格
			  fullscreen: true, // 全屏编辑
			  readmodel: true, // 沉浸式阅读
			  htmlcode: false, // 展示html源码
			  undo: true, // 上一步
			  redo: true, // 下一步
			  trash: true, // 清空
			  navigation: true, // 导航目录
			  subfield: true, // 单双栏模式
			  preview: true, // 预览
			  imagelink: true // 图片链接
    	},
      originalContentData: ''
    };
  },
  props: {

  },
  components: {
    haloEditor
  },
  watch: {

  },
  computed: {
 
  },
  mounted() {
  },
  methods: {
	handleSaveDraft() {
		console.log("aaa")
	}
}
};
</script>

<style lang="less" scoped>

</style>
