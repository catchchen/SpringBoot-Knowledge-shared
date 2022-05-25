<template>
<div>
  <h2>Editor</h2>
  <markdown-editor
  :originalContent="originalContent"
  />
</div>
</template>

<script>
// import { mixin, mixinDevice } from '@/mixins/mixin.js'

// import PostSettingDrawer from './components/PostSettingDrawer'
// import AttachmentDrawer from '../attachment/components/AttachmentDrawer'
import MarkdownEditor from '@/components/Editor/MarkdownEditor'
// import { PageView } from '@/layouts'

// import postApi from '@/api/post'
export default {
  name: 'PostEditor',
  components: {
    MarkdownEditor,
  },
  data () {
    return {
      originalContent: ''
    }
  }
}
</script>
