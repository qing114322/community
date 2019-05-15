<template>
	<div style='text-align: center;'>
		<h1>更新论坛表</h1>
		<el-row>
		  <el-col :span="12"> <el-input style='width:300px;margin-top: 20px;' placeholder='请输入发布时间' v-model='forTime'></el-input> </el-col>
		</el-row>
		<el-row>
		  <el-col :span="12"> <el-input style='width:300px;margin-top: 20px;' placeholder='请输入发布人' v-model='userId'></el-input> </el-col>
		</el-row>
		<el-row>
		  <el-col :span="12"> <el-input style='width:300px;margin-top: 20px;' placeholder='请输入主题' v-model='forTheme'></el-input> </el-col>
		</el-row>
		<el-row>
		  <el-col :span="12"> <el-input style='width:300px;margin-top: 20px;' placeholder='请输入内容' v-model='forContent'></el-input> </el-col>
		</el-row>
		<el-row>
		  <el-col :span="12"> <el-input style='width:300px;margin-top: 20px;' placeholder='请输入图片' v-model='newsImage'></el-input> </el-col>
		</el-row>
		<el-row>
		  <el-col :span="12"> <el-input style='width:300px;margin-top: 20px;' placeholder='请输入审核状态' v-model='exaState'></el-input> </el-col>
		</el-row>
		<el-row>
		  <el-col :span="12"> <el-input style='width:300px;margin-top: 20px;' placeholder='请输入点赞数量' v-model='fabulouscount'></el-input> </el-col>
		</el-row>
		<el-row>
		  <el-col :span="12"> <el-input style='width:300px;margin-top: 20px;' placeholder='请输入0、不置顶 1-5、置顶（按顺序）' v-model='state'></el-input> </el-col>
		</el-row>
		<el-row>
		  <el-col :span="12"> <el-input style='width:300px;margin-top: 20px;' placeholder='请输入0、普通  1、加精' v-model='elite'></el-input> </el-col>
		</el-row>
		<el-row style='margin-top: 20px;text-align: center;'>
		  <el-col :span="24" > <el-button type='primary' @click='saveEdit'>确定</el-button> <el-button @click='cancel'>取消</el-button> </el-col>
		</el-row>
	</div>
</template>
<script>
	export default {
		name:'',
		data() {
			return {
				forId:'',
				forTime:'',
				userId:'',
				forTheme:'',
				forContent:'',
				newsImage:'',
				exaState:'',
				fabulouscount:'',
				state:'',
				elite:'',
			};
		},
		methods:{
			saveEdit(){
				// 后端网址
				var url = this.baseUrl+"/forum/update"
				// 传递给后端的数据
				var data = {forId:this.forId,forTime:this.forTime,userId:this.userId,forTheme:this.forTheme,forContent:this.forContent,newsImage:this.newsImage,exaState:this.exaState,fabulouscount:this.fabulouscount,state:this.state,elite:this.elite};
				this.$axios.post(url,this.$qs.stringify(data),{
					headers: {
						'Content-Type':'application/x-www-form-urlencoded; charset=UTF-8'
					  }
				  }).then(res=>{
					  // res是后端的响应
					  this.$message("更新成功");
					  this.$router.push({path:'/ForumList'});
				  })
			},
			cancel(){
				this.$router.go(-1);
			}
		},
		mounted:function(){
			// 获取路由传递的对象
			var forId = this.$route.params.forId;
			var url2 = this.baseUrl+"/forum/load"
			var data = {forId:forId};
			this.$axios.post(url2,this.$qs.stringify(data),{
				headers: {
					'Content-Type':'application/x-www-form-urlencoded; charset=UTF-8'
				}
			}).then(res=>{
				var obj = res.data;
				this.forId=obj.forId;
				this.forTime=obj.forTime;
				this.userId=obj.userId;
				this.forTheme=obj.forTheme;
				this.forContent=obj.forContent;
				this.newsImage=obj.newsImage;
				this.exaState=obj.exaState;
				this.fabulouscount=obj.fabulouscount;
				this.state=obj.state;
				this.elite=obj.elite;
			})
		}
	}
</script>
<style>

</style>
