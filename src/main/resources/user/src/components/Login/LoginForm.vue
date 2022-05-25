<template>
  <div>
    <!-- <a-form-model
      ref="loginForm"
      :model="form.model"
      :rules="form.rules"
      layout="vertical"
      @keyup.enter.native="form.needAuthCode ? handleLogin() : handleLoginClick()"
    >
      <a-form-model-item
        v-if="!form.needAuthCode"
        class="animated fadeInUp"
        :style="{ 'animation-delay': '0.1s' }"
        prop="username"
      >
        <a-input placeholder="用户名/邮箱" v-model="form.model.username">
          <a-icon slot="prefix" type="user" style="color: rgba(0,0,0,.25)" />
        </a-input>
      </a-form-model-item>
      <a-form-model-item
        v-if="!form.needAuthCode"
        class="animated fadeInUp"
        :style="{ 'animation-delay': '0.2s' }"
        prop="password"
      >
        <a-input v-model="form.model.password" type="password" placeholder="密码">
          <a-icon slot="prefix" type="lock" style="color: rgba(0,0,0,.25)" />
        </a-input>
      </a-form-model-item>
      <a-form-model-item
        v-if="form.needAuthCode"
        class="animated fadeInUp"
        :style="{ 'animation-delay': '0.1s' }"
        prop="authcode"
      >
        <a-input placeholder="两步验证码" v-model="form.model.authcode" :maxLength="6">
          <a-icon slot="prefix" type="safety-certificate" style="color: rgba(0,0,0,.25)" />
        </a-input>
      </a-form-model-item>
      <a-form-model-item class="animated fadeInUp" :style="{ 'animation-delay': '0.3s' }">
        <a-button
          :loading="form.logging"
          type="primary"
          :block="true"
          @click="form.needAuthCode ? handleLogin() : handleLoginClick()"
          >{{ buttonName }}</a-button
        >
      </a-form-model-item>
    </a-form-model> -->

    loginForm
  </div>
</template>
<script>
// import adminApi from '@/api/admin'
// import { mapActions } from 'vuex'
export default {
  name: 'LoginForm',
}
</script>
