<template>
	<div class="addEdit-block" :style='{"minHeight":"100vh","padding":"30px 30px 30px 0","fontSize":"14px","color":"#666","background":"#f4f8fb"}'>
		<el-form
			:style='{"border":"1px solid #e1e8ee","padding":"50px 10% 20px","overflow":"hidden","borderRadius":"0px","alignItems":"flex-start","flexWrap":"wrap","background":"rgba(255,255,255,1)","display":"flex","fontSize":"inherit"}'
			class="add-update-preview"
			ref="ruleForm"
			:model="ruleForm"
			:rules="rules"
			label-width="180px"
		>
			<template >
				<el-form-item :style='{"border":"0px solid #eee","padding":"0","margin":"0 0 20px 0","color":"inherit","borderRadius":"0px","display":"inline-block","width":"100%","fontSize":"inherit"}' class="input" v-if="type!='info'"  label="车牌号" prop="chepaihao">
					<el-input v-model="ruleForm.chepaihao" placeholder="车牌号" clearable  :readonly="ro.chepaihao"></el-input>
				</el-form-item>
				<el-form-item :style='{"border":"0px solid #eee","padding":"0","margin":"0 0 20px 0","color":"inherit","borderRadius":"0px","display":"inline-block","width":"100%","fontSize":"inherit"}' v-else class="input" label="车牌号" prop="chepaihao">
					<el-input v-model="ruleForm.chepaihao" placeholder="车牌号" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"border":"0px solid #eee","padding":"0","margin":"0 0 20px 0","color":"inherit","borderRadius":"0px","display":"inline-block","width":"100%","fontSize":"inherit"}' class="input" v-if="type!='info'"  label="车辆品牌" prop="cheliangpinpai">
					<el-input v-model="ruleForm.cheliangpinpai" placeholder="车辆品牌" clearable  :readonly="ro.cheliangpinpai"></el-input>
				</el-form-item>
				<el-form-item :style='{"border":"0px solid #eee","padding":"0","margin":"0 0 20px 0","color":"inherit","borderRadius":"0px","display":"inline-block","width":"100%","fontSize":"inherit"}' v-else class="input" label="车辆品牌" prop="cheliangpinpai">
					<el-input v-model="ruleForm.cheliangpinpai" placeholder="车辆品牌" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"border":"0px solid #eee","padding":"0","margin":"0 0 20px 0","color":"inherit","borderRadius":"0px","display":"inline-block","width":"100%","fontSize":"inherit"}' class="upload" v-if="type!='info' && !ro.cheliangzhaopian" label="车辆照片" prop="cheliangzhaopian">
					<file-upload
						tip="点击上传车辆照片"
						action="file/upload"
						:limit="3"
						:multiple="true"
						:fileUrls="ruleForm.cheliangzhaopian?ruleForm.cheliangzhaopian:''"
						@change="cheliangzhaopianUploadChange"
					></file-upload>
				</el-form-item>
				<el-form-item :style='{"border":"0px solid #eee","padding":"0","margin":"0 0 20px 0","color":"inherit","borderRadius":"0px","display":"inline-block","width":"100%","fontSize":"inherit"}' class="upload" v-else-if="ruleForm.cheliangzhaopian" label="车辆照片" prop="cheliangzhaopian">
					<img v-if="ruleForm.cheliangzhaopian.substring(0,4)=='http'" class="upload-img" style="margin-right:20px;" v-bind:key="index" :src="ruleForm.cheliangzhaopian.split(',')[0]" width="100" height="100">
					<img v-else class="upload-img" style="margin-right:20px;" v-bind:key="index" v-for="(item,index) in ruleForm.cheliangzhaopian.split(',')" :src="$base.url+item" width="100" height="100">
				</el-form-item>
				<el-form-item :style='{"border":"0px solid #eee","padding":"0","margin":"0 0 20px 0","color":"inherit","borderRadius":"0px","display":"inline-block","width":"100%","fontSize":"inherit"}' class="input" v-if="type!='info'"  label="车辆颜色" prop="cheliangyanse">
					<el-input v-model="ruleForm.cheliangyanse" placeholder="车辆颜色" clearable  :readonly="ro.cheliangyanse"></el-input>
				</el-form-item>
				<el-form-item :style='{"border":"0px solid #eee","padding":"0","margin":"0 0 20px 0","color":"inherit","borderRadius":"0px","display":"inline-block","width":"100%","fontSize":"inherit"}' v-else class="input" label="车辆颜色" prop="cheliangyanse">
					<el-input v-model="ruleForm.cheliangyanse" placeholder="车辆颜色" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"border":"0px solid #eee","padding":"0","margin":"0 0 20px 0","color":"inherit","borderRadius":"0px","display":"inline-block","width":"100%","fontSize":"inherit"}' class="input" v-if="type!='info'"  label="用户账号" prop="yonghuzhanghao">
					<el-input v-model="ruleForm.yonghuzhanghao" placeholder="用户账号" clearable  :readonly="ro.yonghuzhanghao"></el-input>
				</el-form-item>
				<el-form-item :style='{"border":"0px solid #eee","padding":"0","margin":"0 0 20px 0","color":"inherit","borderRadius":"0px","display":"inline-block","width":"100%","fontSize":"inherit"}' v-else class="input" label="用户账号" prop="yonghuzhanghao">
					<el-input v-model="ruleForm.yonghuzhanghao" placeholder="用户账号" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"border":"0px solid #eee","padding":"0","margin":"0 0 20px 0","color":"inherit","borderRadius":"0px","display":"inline-block","width":"100%","fontSize":"inherit"}' class="input" v-if="type!='info'"  label="用户姓名" prop="yonghuxingming">
					<el-input v-model="ruleForm.yonghuxingming" placeholder="用户姓名" clearable  :readonly="ro.yonghuxingming"></el-input>
				</el-form-item>
				<el-form-item :style='{"border":"0px solid #eee","padding":"0","margin":"0 0 20px 0","color":"inherit","borderRadius":"0px","display":"inline-block","width":"100%","fontSize":"inherit"}' v-else class="input" label="用户姓名" prop="yonghuxingming">
					<el-input v-model="ruleForm.yonghuxingming" placeholder="用户姓名" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"border":"0px solid #eee","padding":"0","margin":"0 0 20px 0","color":"inherit","borderRadius":"0px","display":"inline-block","width":"100%","fontSize":"inherit"}' class="input" v-if="type!='info'"  label="手机" prop="shouji">
					<el-input v-model="ruleForm.shouji" placeholder="手机" clearable  :readonly="ro.shouji"></el-input>
				</el-form-item>
				<el-form-item :style='{"border":"0px solid #eee","padding":"0","margin":"0 0 20px 0","color":"inherit","borderRadius":"0px","display":"inline-block","width":"100%","fontSize":"inherit"}' v-else class="input" label="手机" prop="shouji">
					<el-input v-model="ruleForm.shouji" placeholder="手机" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"border":"0px solid #eee","padding":"0","margin":"0 0 20px 0","color":"inherit","borderRadius":"0px","display":"inline-block","width":"100%","fontSize":"inherit"}' class="input" v-if="type!='info'"  label="楼栋" prop="loudong">
					<el-input v-model="ruleForm.loudong" placeholder="楼栋" clearable  :readonly="ro.loudong"></el-input>
				</el-form-item>
				<el-form-item :style='{"border":"0px solid #eee","padding":"0","margin":"0 0 20px 0","color":"inherit","borderRadius":"0px","display":"inline-block","width":"100%","fontSize":"inherit"}' v-else class="input" label="楼栋" prop="loudong">
					<el-input v-model="ruleForm.loudong" placeholder="楼栋" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"border":"0px solid #eee","padding":"0","margin":"0 0 20px 0","color":"inherit","borderRadius":"0px","display":"inline-block","width":"100%","fontSize":"inherit"}' class="input" v-if="type!='info'"  label="门牌号" prop="menpaihao">
					<el-input v-model="ruleForm.menpaihao" placeholder="门牌号" clearable  :readonly="ro.menpaihao"></el-input>
				</el-form-item>
				<el-form-item :style='{"border":"0px solid #eee","padding":"0","margin":"0 0 20px 0","color":"inherit","borderRadius":"0px","display":"inline-block","width":"100%","fontSize":"inherit"}' v-else class="input" label="门牌号" prop="menpaihao">
					<el-input v-model="ruleForm.menpaihao" placeholder="门牌号" readonly></el-input>
				</el-form-item>
			</template>
			<el-form-item :style='{"padding":"10px 0 20px","margin":"30px 0","alignItems":"center","textAlign":"left","display":"block","width":"100%","clear":"both","perspective":"320px","-webkitPerspective":"320px","fontSize":"48px","justifyContent":"flex-start"}' class="btn">
				<el-button class="btn3"  v-if="type!='info'" type="success" @click="onSubmit">
					<span class="icon iconfont icon-tijiao16" :style='{"margin":"0 2px","fontSize":"18px","color":"inherit","display":"none"}'></span>
					保存
				</el-button>
				<el-button class="btn4" v-if="type!='info'" type="success" @click="back()">
					<span class="icon iconfont icon-quxiao09" :style='{"margin":"0 2px","fontSize":"18px","color":"inherit","display":"none"}'></span>
					取消
				</el-button>
				<el-button class="btn5" v-if="type=='info'" type="success" @click="back()">
					<span class="icon iconfont icon-fanhui01" :style='{"margin":"0 2px","fontSize":"18px","color":"inherit","display":"none"}'></span>
					返回
				</el-button>
			</el-form-item>
		</el-form>
    

  </div>
</template>
<script>
// 数字，邮件，手机，url，身份证校验
import { isNumber,isIntNumer,isEmail,isPhone, isMobile,isURL,checkIdCard } from "@/utils/validate";
export default {
	data() {
		let self = this
		var validateIdCard = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!checkIdCard(value)) {
				callback(new Error("请输入正确的身份证号码"));
			} else {
				callback();
			}
		};
		var validateUrl = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isURL(value)) {
				callback(new Error("请输入正确的URL地址"));
			} else {
				callback();
			}
		};
		var validateMobile = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isMobile(value)) {
				callback(new Error("请输入正确的手机号码"));
			} else {
				callback();
			}
		};
		var validatePhone = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isPhone(value)) {
				callback(new Error("请输入正确的电话号码"));
			} else {
				callback();
			}
		};
		var validateEmail = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isEmail(value)) {
				callback(new Error("请输入正确的邮箱地址"));
			} else {
				callback();
			}
		};
		var validateNumber = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isNumber(value)) {
				callback(new Error("请输入数字"));
			} else {
				callback();
			}
		};
		var validateIntNumber = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isIntNumer(value)) {
				callback(new Error("请输入整数"));
			} else {
				callback();
			}
		};
		return {
			id: '',
			type: '',
			
			
			ro:{
				chepaihao : false,
				cheliangpinpai : false,
				cheliangzhaopian : false,
				cheliangyanse : false,
				yonghuzhanghao : false,
				yonghuxingming : false,
				shouji : false,
				loudong : false,
				menpaihao : false,
			},
			
			
			ruleForm: {
				chepaihao: '',
				cheliangpinpai: '',
				cheliangzhaopian: '',
				cheliangyanse: '',
				yonghuzhanghao: '',
				yonghuxingming: '',
				shouji: '',
				loudong: '',
				menpaihao: '',
			},
		

			
			rules: {
				chepaihao: [
				],
				cheliangpinpai: [
				],
				cheliangzhaopian: [
				],
				cheliangyanse: [
				],
				yonghuzhanghao: [
				],
				yonghuxingming: [
				],
				shouji: [
				],
				loudong: [
				],
				menpaihao: [
				],
			}
		};
	},
	props: ["parent"],
	computed: {



	},
    components: {
    },
	created() {
	},
	methods: {
		
		// 下载
		download(file){
			window.open(`${file}`)
		},
		// 初始化
		init(id,type) {
			if (id) {
				this.id = id;
				this.type = type;
			}
			if(this.type=='info'||this.type=='else'){
				this.info(id);
			}else if(this.type=='logistics'){
				this.logistics=false;
				this.info(id);
			}else if(this.type=='cross'){
				var obj = this.$storage.getObj('crossObj');
				for (var o in obj){
						if(o=='chepaihao'){
							this.ruleForm.chepaihao = obj[o];
							this.ro.chepaihao = true;
							continue;
						}
						if(o=='cheliangpinpai'){
							this.ruleForm.cheliangpinpai = obj[o];
							this.ro.cheliangpinpai = true;
							continue;
						}
						if(o=='cheliangzhaopian'){
							this.ruleForm.cheliangzhaopian = obj[o];
							this.ro.cheliangzhaopian = true;
							continue;
						}
						if(o=='cheliangyanse'){
							this.ruleForm.cheliangyanse = obj[o];
							this.ro.cheliangyanse = true;
							continue;
						}
						if(o=='yonghuzhanghao'){
							this.ruleForm.yonghuzhanghao = obj[o];
							this.ro.yonghuzhanghao = true;
							continue;
						}
						if(o=='yonghuxingming'){
							this.ruleForm.yonghuxingming = obj[o];
							this.ro.yonghuxingming = true;
							continue;
						}
						if(o=='shouji'){
							this.ruleForm.shouji = obj[o];
							this.ro.shouji = true;
							continue;
						}
						if(o=='loudong'){
							this.ruleForm.loudong = obj[o];
							this.ro.loudong = true;
							continue;
						}
						if(o=='menpaihao'){
							this.ruleForm.menpaihao = obj[o];
							this.ro.menpaihao = true;
							continue;
						}
				}
			}
			// 获取用户信息
			this.$http({
				url: `${this.$storage.get('sessionTable')}/session`,
				method: "get"
			}).then(({ data }) => {
				if (data && data.code === 0) {
					var json = data.data;
					if(((json.yonghuzhanghao!=''&&json.yonghuzhanghao) || json.yonghuzhanghao==0) && this.$storage.get("role")!="管理员"){
						this.ruleForm.yonghuzhanghao = json.yonghuzhanghao
						this.ro.yonghuzhanghao = true;
					}
					if(((json.yonghuxingming!=''&&json.yonghuxingming) || json.yonghuxingming==0) && this.$storage.get("role")!="管理员"){
						this.ruleForm.yonghuxingming = json.yonghuxingming
						this.ro.yonghuxingming = true;
					}
					if(((json.shouji!=''&&json.shouji) || json.shouji==0) && this.$storage.get("role")!="管理员"){
						this.ruleForm.shouji = json.shouji
						this.ro.shouji = true;
					}
					if(((json.loudong!=''&&json.loudong) || json.loudong==0) && this.$storage.get("role")!="管理员"){
						this.ruleForm.loudong = json.loudong
						this.ro.loudong = true;
					}
					if(((json.menpaihao!=''&&json.menpaihao) || json.menpaihao==0) && this.$storage.get("role")!="管理员"){
						this.ruleForm.menpaihao = json.menpaihao
						this.ro.menpaihao = true;
					}
				} else {
					this.$message.error(data.msg);
				}
			});
			
		},
    // 多级联动参数

    info(id) {
      this.$http({
        url: `cheliangxinxi/info/${id}`,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
        this.ruleForm = data.data;
        //解决前台上传图片后台不显示的问题
        let reg=new RegExp('../../../upload','g')//g代表全部
        } else {
          this.$message.error(data.msg);
        }
      });
    },


    // 提交
    onSubmit() {
	if(this.ruleForm.cheliangzhaopian!=null) {
		this.ruleForm.cheliangzhaopian = this.ruleForm.cheliangzhaopian.replace(new RegExp(this.$base.url,"g"),"");
	}
var objcross = this.$storage.getObj('crossObj');
      //更新跨表属性
       var crossuserid;
       var crossrefid;
       var crossoptnum;
       if(this.type=='cross'){
                var statusColumnName = this.$storage.get('statusColumnName');
                var statusColumnValue = this.$storage.get('statusColumnValue');
                if(statusColumnName!='') {
                        var obj = this.$storage.getObj('crossObj');
                       if(statusColumnName && !statusColumnName.startsWith("[")) {
                               for (var o in obj){
                                 if(o==statusColumnName){
                                   obj[o] = statusColumnValue;
                                 }
                               }
                               var table = this.$storage.get('crossTable');
                             this.$http({
                                 url: `${table}/update`,
                                 method: "post",
                                 data: obj
                               }).then(({ data }) => {});
                       } else {
                               crossuserid=this.$storage.get('userid');
                               crossrefid=obj['id'];
                               crossoptnum=this.$storage.get('statusColumnName');
                               crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
                        }
                }
        }
		this.$refs["ruleForm"].validate(valid => {
			if (valid) {
				if(crossrefid && crossuserid) {
					this.ruleForm.crossuserid = crossuserid;
					this.ruleForm.crossrefid = crossrefid;
					let params = { 
						page: 1, 
						limit: 10, 
						crossuserid:this.ruleForm.crossuserid,
						crossrefid:this.ruleForm.crossrefid,
					} 
				this.$http({ 
					url: "cheliangxinxi/page", 
					method: "get", 
					params: params 
				}).then(({ 
					data 
				}) => { 
					if (data && data.code === 0) { 
						if(data.data.total>=crossoptnum) {
							this.$message.error(this.$storage.get('tips'));
							return false;
						} else {
							this.$http({
								url: `cheliangxinxi/${!this.ruleForm.id ? "save" : "update"}`,
								method: "post",
								data: this.ruleForm
							}).then(({ data }) => {
								if (data && data.code === 0) {
									this.$message({
										message: "操作成功",
										type: "success",
										duration: 1500,
										onClose: () => {
											this.parent.showFlag = true;
											this.parent.addOrUpdateFlag = false;
											this.parent.cheliangxinxiCrossAddOrUpdateFlag = false;
											this.parent.search();
											this.parent.contentStyleChange();
										}
									});
								} else {
									this.$message.error(data.msg);
								}
							});

						}
					} else { 
				} 
			});
		} else {
			this.$http({
				url: `cheliangxinxi/${!this.ruleForm.id ? "save" : "update"}`,
				method: "post",
			   data: this.ruleForm
			}).then(({ data }) => {
				if (data && data.code === 0) {
					this.$message({
						message: "操作成功",
						type: "success",
						duration: 1500,
						onClose: () => {
							this.parent.showFlag = true;
							this.parent.addOrUpdateFlag = false;
							this.parent.cheliangxinxiCrossAddOrUpdateFlag = false;
							this.parent.search();
							this.parent.contentStyleChange();
						}
					});
				} else {
					this.$message.error(data.msg);
			   }
			});
		 }
         }
       });
    },
    // 获取uuid
    getUUID () {
      return new Date().getTime();
    },
    // 返回
    back() {
      this.parent.showFlag = true;
      this.parent.addOrUpdateFlag = false;
      this.parent.cheliangxinxiCrossAddOrUpdateFlag = false;
      this.parent.contentStyleChange();
    },
    cheliangzhaopianUploadChange(fileUrls) {
	    this.ruleForm.cheliangzhaopian = fileUrls;
    },
  }
};
</script>
<style lang="scss" scoped>
	.amap-wrapper {
		width: 100%;
		height: 500px;
	}
	
	.search-box {
		position: absolute;
	}
	
	.el-date-editor.el-input {
		width: auto;
	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__label {
	  	  padding: 0 10px 0 0;
	  	  color: #333;
	  	  font-weight: 600;
	  	  display: inline-block;
	  	  width: 180px;
	  	  font-size: inherit;
	  	  line-height: 40px;
	  	  text-align: right;
	  	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__content {
	  margin-left: 180px;
	}
	
	.add-update-preview .el-input /deep/ .el-input__inner {
	  	  padding: 0 12px;
	  	  color: inherit;
	  	  font-size: 14px;
	  	  border-color: #e1e8ee;
	  	  border-radius: 0px;
	  	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  	  outline: none;
	  	  background: #f5f8fa;
	  	  width: auto;
	  	  border-width: 1px;
	  	  border-style: solid;
	  	  min-width: 350px;
	  	  height: 32px;
	  	}
	.add-update-preview .el-input-number /deep/ .el-input__inner {
		text-align: left;
	  	  padding: 0 12px;
	  	  color: inherit;
	  	  font-size: 14px;
	  	  border-color: #e1e8ee;
	  	  border-radius: 0px;
	  	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  	  outline: none;
	  	  background: #f5f8fa;
	  	  width: auto;
	  	  border-width: 1px;
	  	  border-style: solid;
	  	  min-width: 350px;
	  	  height: 32px;
	  	}
	.add-update-preview .el-input-number /deep/ .el-input-number__decrease {
		display: none;
	}
	.add-update-preview .el-input-number /deep/ .el-input-number__increase {
		display: none;
	}
	
	.add-update-preview .el-select /deep/ .el-input__inner {
	  	  padding: 0 10px;
	  	  color: inherit;
	  	  font-size: 14px;
	  	  border-color: #e1e8ee;
	  	  border-radius: 0px;
	  	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  	  outline: none;
	  	  background: #f5f8fa;
	  	  width: auto;
	  	  border-width: 1px;
	  	  border-style: solid;
	  	  min-width: 350px;
	  	  height: 32px;
	  	}
	
	.add-update-preview .el-date-editor /deep/ .el-input__inner {
	  	  padding: 0 10px 0 30px;
	  	  color: inherit;
	  	  font-size: 14px;
	  	  border-color: #e1e8ee;
	  	  border-radius: 0px;
	  	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  	  outline: none;
	  	  background: #f5f8fa;
	  	  width: auto;
	  	  border-width: 1px;
	  	  border-style: solid;
	  	  min-width: 350px;
	  	  height: 32px;
	  	}
	
	.add-update-preview /deep/ .el-upload--picture-card {
		background: transparent;
		border: 0;
		border-radius: 0;
		width: auto;
		height: auto;
		line-height: initial;
		vertical-align: middle;
	}
	
	.add-update-preview /deep/ .upload .upload-img {
	  	  cursor: pointer;
	  	  color: #c0cfdc;
	  	  object-fit: cover;
	  	  font-size: 24px;
	  	  border-color: #e1e8ee;
	  	  line-height: 90px;
	  	  border-radius: 16px;
	  	  background: #f5f8fa;
	  	  width: 90px;
	  	  border-width: 1px;
	  	  border-style: solid;
	  	  text-align: center;
	  	  height: 90px;
	  	}
	
	.add-update-preview /deep/ .el-upload-list .el-upload-list__item {
	  	  cursor: pointer;
	  	  color: #c0cfdc;
	  	  object-fit: cover;
	  	  font-size: 24px;
	  	  border-color: #e1e8ee;
	  	  line-height: 90px;
	  	  border-radius: 16px;
	  	  background: #f5f8fa;
	  	  width: 90px;
	  	  border-width: 1px;
	  	  border-style: solid;
	  	  text-align: center;
	  	  height: 90px;
	  	}
	
	.add-update-preview /deep/ .el-upload .el-icon-plus {
	  	  cursor: pointer;
	  	  color: #c0cfdc;
	  	  object-fit: cover;
	  	  font-size: 24px;
	  	  border-color: #e1e8ee;
	  	  line-height: 90px;
	  	  border-radius: 16px;
	  	  background: #f5f8fa;
	  	  width: 90px;
	  	  border-width: 1px;
	  	  border-style: solid;
	  	  text-align: center;
	  	  height: 90px;
	  	}
	
	.add-update-preview .el-textarea /deep/ .el-textarea__inner {
	  	  padding: 12px;
	  	  color: inherit;
	  	  font-size: 14px;
	  	  border-color: #e1e8ee;
	  	  min-height: 120px;
	  	  border-radius: 0px;
	  	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  	  outline: none;
	  	  background: #f5f8fa;
	  	  width: auto;
	  	  border-width: 1px;
	  	  border-style: solid;
	  	  min-width: 550px;
	  	  height: auto;
	  	}
	
	.add-update-preview .btn .btn1 {
				border: 1px solid rgba(53, 184, 224, 0.1);
				cursor: pointer;
				padding: 0 10px;
				margin: 0px 4px;
				color: #fff;
				display: inline-block;
				font-size: 12px;
				line-height: 24px;
				border-radius: 2px;
				outline: none;
				background: #03a9f4;
				width: auto;
				height: 26px;
			}
	
	.add-update-preview .btn .btn1:hover {
				box-shadow: 0px 0px 9px #ccc;
				transform: translate3d(0px, 0px, 0px);
				opacity: 0.8;
			}
	
	.add-update-preview .btn .btn2 {
				border: 1px solid rgba(24, 138, 226, 0.1) ;
				cursor: pointer;
				border-radius: 2px;
				padding: 0 10px;
				margin: 0px 4px;
				outline: none;
				color: #fff;
				background: #6c757d;
				width: auto;
				font-size: 12px;
				line-height: 24px;
				height: 26px;
			}
	
	.add-update-preview .btn .btn2:hover {
				box-shadow: 0px 0px 9px #ccc;
				transform: translate3d(0px, 0px, 0px);
				opacity: 0.8;
			}
	
	.add-update-preview .btn .btn3 {
				border: 0px solid #0260ad;
				cursor: pointer;
				border-radius: 2px;
				padding: 0 20px;
				margin: 0px 4px;
				outline: none;
				color: #fff;
				background: #78bcee;
				width: auto;
				font-size: 12px;
				line-height: 24px;
				height: 26px;
			}
	
	.add-update-preview .btn .btn3:hover {
				box-shadow: 0px 0px 9px #ccc;
				transform: translate3d(0px, 0px, 0px);
				opacity: 0.8;
			}
	
	.add-update-preview .btn .btn4 {
				border: 0px solid rgba(126, 96, 16, .2);
				cursor: pointer;
				border-radius: 2px;
				padding: 0 20px;
				margin: 0px 4px;
				outline: none;
				color: #fff;
				background: #7dc855;
				width: auto;
				font-size: 12px;
				line-height: 24px;
				height: 26px;
			}
	
	.add-update-preview .btn .btn4:hover {
				box-shadow: 0px 0px 9px #ccc;
				transform: translate3d(0px, 0px, 0px);
				background: rgba(28,132,198,1);
				opacity: 1;
			}
	
	.add-update-preview .btn .btn5 {
				border: 0px solid rgba(114, 123, 132, 0.1);
				cursor: pointer;
				border-radius: 2px;
				padding: 0 20px;
				margin: 4px;
				outline: none;
				color: #fff;
				background: #fcce54;
				width: auto;
				font-size: 12px;
				line-height: 24px;
				height: 26px;
			}
	
	.add-update-preview .btn .btn5:hover {
				box-shadow: 0px 0px 9px #ccc;
				transform: translate3d(0px, 0px, 0px);
				opacity: 1;
			}
</style>
