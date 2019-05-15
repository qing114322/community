<template>
	<div style='text-align: center;'>
		<h1>更新活动表</h1>
		<el-row>
		  <el-col :span="12"> <el-input style='width:300px;margin-top: 20px;' placeholder='请输入发布时间' v-model='actTime'></el-input> </el-col>
		</el-row>
		<el-row>
		  <el-col :span="12"> <el-input style='width:300px;margin-top: 20px;' placeholder='请输入主题' v-model='actThene'></el-input> </el-col>
		</el-row>
		<el-row>
		  <el-col :span="12"> <el-input style='width:300px;margin-top: 20px;' placeholder='请输入内容' v-model='actContent'></el-input> </el-col>
		</el-row>
		<el-row>
		  <el-col :span="12"> <el-input style='width:300px;margin-top: 20px;' placeholder='请输入1、正在进行 2、长期活动 3、已过期' v-model='state'></el-input> </el-col>
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
				actId:'',
				actTime:'',
				actThene:'',
				actContent:'',
				state:'',
			};
		},
		methods:{
			saveEdit(){
				// 后端网址
				var url = this.baseUrl+"/activity/update"
				// 传递给后端的数据
				var data = {actId:this.actId,actTime:this.actTime,actThene:this.actThene,actContent:this.actContent,state:this.state};
				this.$axios.post(url,this.$qs.stringify(data),{
					headers: {
						'Content-Type':'application/x-www-form-urlencoded; charset=UTF-8'
					  }
				  }).then(res=>{
					  // res是后端的响应
					  this.$message("更新成功");
					  this.$router.push({path:'/ActivityList'});
				  })
			},
			cancel(){
				this.$router.go(-1);
			}
		},
		mounted:function(){
			// 获取路由传递的对象
			var actId = this.$route.params.actId;
			var url2 = this.baseUrl+"/activity/load"
			var data = {actId:actId};
			this.$axios.post(url2,this.$qs.stringify(data),{
				headers: {
					'Content-Type':'application/x-www-form-urlencoded; charset=UTF-8'
				}
			}).then(res=>{
				var obj = res.data;
				this.actId=obj.actId;
				this.actTime=obj.actTime;
				this.actThene=obj.actThene;
				this.actContent=obj.actContent;
				this.state=obj.state;
			})
		}
	}
</script>
<style>

</style>
