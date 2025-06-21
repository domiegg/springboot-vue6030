import VueRouter from 'vue-router'

//引入组件
import Index from '../pages'
import Home from '../pages/home/home'
import Login from '../pages/login/login'
import Register from '../pages/register/register'
import Center from '../pages/center/center'
import Storeup from '../pages/storeup/list'
import News from '../pages/news/news-list'
import NewsDetail from '../pages/news/news-detail'
import payList from '../pages/pay'

import yonghuList from '../pages/yonghu/list'
import yonghuDetail from '../pages/yonghu/detail'
import yonghuAdd from '../pages/yonghu/add'
import baoxiuxinxiList from '../pages/baoxiuxinxi/list'
import baoxiuxinxiDetail from '../pages/baoxiuxinxi/detail'
import baoxiuxinxiAdd from '../pages/baoxiuxinxi/add'
import baoxiuchuliList from '../pages/baoxiuchuli/list'
import baoxiuchuliDetail from '../pages/baoxiuchuli/detail'
import baoxiuchuliAdd from '../pages/baoxiuchuli/add'
import tousuxinxiList from '../pages/tousuxinxi/list'
import tousuxinxiDetail from '../pages/tousuxinxi/detail'
import tousuxinxiAdd from '../pages/tousuxinxi/add'
import tousuchuliList from '../pages/tousuchuli/list'
import tousuchuliDetail from '../pages/tousuchuli/detail'
import tousuchuliAdd from '../pages/tousuchuli/add'
import jiaofeixinxiList from '../pages/jiaofeixinxi/list'
import jiaofeixinxiDetail from '../pages/jiaofeixinxi/detail'
import jiaofeixinxiAdd from '../pages/jiaofeixinxi/add'
import gonggongsheshiList from '../pages/gonggongsheshi/list'
import gonggongsheshiDetail from '../pages/gonggongsheshi/detail'
import gonggongsheshiAdd from '../pages/gonggongsheshi/add'
import sheshiyuyueList from '../pages/sheshiyuyue/list'
import sheshiyuyueDetail from '../pages/sheshiyuyue/detail'
import sheshiyuyueAdd from '../pages/sheshiyuyue/add'
import cheliangxinxiList from '../pages/cheliangxinxi/list'
import cheliangxinxiDetail from '../pages/cheliangxinxi/detail'
import cheliangxinxiAdd from '../pages/cheliangxinxi/add'
import newstypeList from '../pages/newstype/list'
import newstypeDetail from '../pages/newstype/detail'
import newstypeAdd from '../pages/newstype/add'

const originalPush = VueRouter.prototype.push
VueRouter.prototype.push = function push(location) {
	return originalPush.call(this, location).catch(err => err)
}

//配置路由
export default new VueRouter({
	routes:[
		{
      path: '/',
      redirect: '/index/home'
    },
		{
			path: '/index',
			component: Index,
			children:[
				{
					path: 'home',
					component: Home
				},
				{
					path: 'center',
					component: Center,
				},
				{
					path: 'pay',
					component: payList,
				},
				{
					path: 'storeup',
					component: Storeup
				},
				{
					path: 'news',
					component: News
				},
				{
					path: 'newsDetail',
					component: NewsDetail
				},
				{
					path: 'yonghu',
					component: yonghuList
				},
				{
					path: 'yonghuDetail',
					component: yonghuDetail
				},
				{
					path: 'yonghuAdd',
					component: yonghuAdd
				},
				{
					path: 'baoxiuxinxi',
					component: baoxiuxinxiList
				},
				{
					path: 'baoxiuxinxiDetail',
					component: baoxiuxinxiDetail
				},
				{
					path: 'baoxiuxinxiAdd',
					component: baoxiuxinxiAdd
				},
				{
					path: 'baoxiuchuli',
					component: baoxiuchuliList
				},
				{
					path: 'baoxiuchuliDetail',
					component: baoxiuchuliDetail
				},
				{
					path: 'baoxiuchuliAdd',
					component: baoxiuchuliAdd
				},
				{
					path: 'tousuxinxi',
					component: tousuxinxiList
				},
				{
					path: 'tousuxinxiDetail',
					component: tousuxinxiDetail
				},
				{
					path: 'tousuxinxiAdd',
					component: tousuxinxiAdd
				},
				{
					path: 'tousuchuli',
					component: tousuchuliList
				},
				{
					path: 'tousuchuliDetail',
					component: tousuchuliDetail
				},
				{
					path: 'tousuchuliAdd',
					component: tousuchuliAdd
				},
				{
					path: 'jiaofeixinxi',
					component: jiaofeixinxiList
				},
				{
					path: 'jiaofeixinxiDetail',
					component: jiaofeixinxiDetail
				},
				{
					path: 'jiaofeixinxiAdd',
					component: jiaofeixinxiAdd
				},
				{
					path: 'gonggongsheshi',
					component: gonggongsheshiList
				},
				{
					path: 'gonggongsheshiDetail',
					component: gonggongsheshiDetail
				},
				{
					path: 'gonggongsheshiAdd',
					component: gonggongsheshiAdd
				},
				{
					path: 'sheshiyuyue',
					component: sheshiyuyueList
				},
				{
					path: 'sheshiyuyueDetail',
					component: sheshiyuyueDetail
				},
				{
					path: 'sheshiyuyueAdd',
					component: sheshiyuyueAdd
				},
				{
					path: 'cheliangxinxi',
					component: cheliangxinxiList
				},
				{
					path: 'cheliangxinxiDetail',
					component: cheliangxinxiDetail
				},
				{
					path: 'cheliangxinxiAdd',
					component: cheliangxinxiAdd
				},
				{
					path: 'newstype',
					component: newstypeList
				},
				{
					path: 'newstypeDetail',
					component: newstypeDetail
				},
				{
					path: 'newstypeAdd',
					component: newstypeAdd
				},
			]
		},
		{
			path: '/login',
			component: Login
		},
		{
			path: '/register',
			component: Register
		},
	]
})
