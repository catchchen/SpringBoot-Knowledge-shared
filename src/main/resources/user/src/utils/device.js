import enquireJs from 'enquire.js'
// 适应 多端设备
export const DEVICE_TYPE = {
  DESKTOP: 'desktop',
  TABLET: 'tablet',
  MOBILE: 'mobile'
}


export const deviceEnquire = function(callback) {
  const matchDesktop = {
    match: () => {
      callback && callback(DEVICE_TYPE.DESKTOP)
    }
  }

  const matchLablet = {
    match: () => {
      callback && callback(DEVICE_TYPE.TABLET)
    }
  }

  const matchMobile = {
    match: () => {
      callback && callback(DEVICE_TYPE.MOBILE)
    }
  }
//媒体查询 适应不同设备之间的
  // screen and (max-width: 1087.99px)
  enquireJs
    .register('screen and (max-width: 576px)', matchMobile)
    .register('screen and (min-width: 576px) and (max-width: 1199px)', matchLablet)
    .register('screen and (min-width: 1200px)', matchDesktop)
}
