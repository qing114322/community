<template>
	<div style='text-align: center;'>
		<h1>添加二级评论表</h1>
		<el-row>
		  <el-col :span="12"> <el-input style='width:300px;margin-top: 20px;' placeholder='请输入评论人' v-model='userId'></el-input> </el-col>
		</el-row>
		<el-row>
		  <el-col :span="12"> <el-input style='width:300px;margin-top: 20px;' placeholder='请输入接收人' v-model='receiveId'></el-input> </el-col>
		</el-row>
		<el-row>
		  <el-col :span="12"> <el-input style='width:300px;margin-top: 20px;' placeholder='请输入评论id' v-model='comId'></el-input> </el-col>
		</el-row>
		<el-row>
		  <el-col :span="12"> <el-input style='width:300px;margin-top: 20px;' placeholder='请输入评论内容' v-model='secondContent'></el-input> </el-col>
		</el-row>
		<el-row>
		  <el-col :span="12"> <el-input style='width:300px;margin-top: 20px;' placeholder='请输入评论时间' v-model='secondTime'></el-input> </el-col>
		</el-row>
		<el-row>
		  <el-col :span="12"> <el-input style='width:300px;margin-top: 20px;' placeholder='请输入点赞数量' v-model='fabulouscount'></el-input> </el-col>
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
				userId:'',
				receiveId:'',
				comId:'',
				secondContent:'',
				secondTime:'',
				fabulouscount:'',
			};
		},
		methods:{
			saveAdd(){
				// 后端网址
				var url = this.baseUrl+"/secondcomment/insert"
				// 传递给后端的数据
				var data = {userId:this.userId,receiveId:this.receiveId,comId:this.comId,secondContent:this.secondContent,secondTime:this.secondTime,fabulouscount:this.fabulouscount};
				this.$axios.post(url,this.$qs.stringify(data),{
					headers: {
						'Content-Type':'application/x-www-form-urlencoded; charset=UTF-8'
					  }
				  }).then(res=>{
					  // res是后端的响应
					  this.$message("添加成功");
					  this.$router.push({path:'/SecondcommentList'});
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

