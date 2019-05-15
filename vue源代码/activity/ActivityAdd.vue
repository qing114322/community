<template>
	<div style='text-align: center;'>
		<h1>添加活动表</h1>
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
		  <el-col :span="24" > <el-button type='primary' @click='saveAdd'>确定</el-button> <el-button @click='cancel'>取消</el-button> </el-col>
		</el-row>
	</div>
</template>
<script>
	export default {
		name:'',
		data() {
			return {
				actTime:'',
				actThene:'',
				actContent:'',
				state:'',
			};
		},
		methods:{
			saveAdd(){
				// 后端网址
				var url = this.baseUrl+"/activity/insert"
				// 传递给后端的数据
				var data = {actTime:this.actTime,actThene:this.actThene,actContent:this.actContent,state:this.state};
				this.$axios.post(url,this.$qs.stringify(data),{
					headers: {
						'Content-Type':'application/x-www-form-urlencoded; charset=UTF-8'
					  }
				  }).then(res=>{
					  // res是后端的响应
					  this.$message("添加成功");
					  this.$router.push({path:'/ActivityList'});
				  })
			},
			cancel(){
				this.$router.go(-1);
			}
		},
		
	}
</script>

<style>

</style>

