<template>
	<div>
		<h1 style="text-align: center">二级评论表</h1>
		<div style="text-align: left;margin:0 0 20px 50px;">
			<el-input style='width:160px' placeholder='评论人' v-model='search_userId'></el-input>
			<el-button @click='search'>查询</el-button>
			<el-button @click='add'>添加</el-button>
		</div>
		<center>
			<el-table :data="list">
				<el-table-column prop="secId" label="主键" width="80"></el-table-column>
				<el-table-column prop="userId" label="评论人" width="120"></el-table-column>
				<el-table-column prop="receiveId" label="接收人" width="120"></el-table-column>
				<el-table-column prop="comId" label="评论id" width="120"></el-table-column>
				<el-table-column prop="secondContent" label="评论内容" width="120"></el-table-column>
				<el-table-column prop="secondTime" label="评论时间" width="120"></el-table-column>
				<el-table-column prop="fabulouscount" label="点赞数量" width="120"></el-table-column>
				<el-table-column label="操作" width="180">
				  <template slot-scope="scope">
					<el-button size="mini" @click="update(scope.row.secId)">编辑</el-button>
					<el-button size="mini" type='danger' @click="del(scope.row.secId)">删除</el-button>
				  </template>
				</el-table-column>
			</el-table>
		</center>
	</div>
</template>
<script>
	export default {
		name:'',
		data() {
			return {
				search_userId:'',
				list:[]
			};
		},
		methods:{
			update(secId){
				this.$router.push({name:'SecondcommentEdit',params:{secId:secId}});
			},
			del(secId){
				var url = this.baseUrl+"/secondcomment/delete"
				var data = {secId:secId};
				this.$axios.post(url,this.$qs.stringify(data),{
					headers: {
						'Content-Type':'application/x-www-form-urlencoded; charset=UTF-8'
					}
				}).then(res=>{
					this.$message("删除成功");
					this.search();
			    })
			},
			add(){
				this.$router.push("/SecondcommentAdd");
			},
			search(){
				var url = this.baseUrl+"/secondcomment/search"
				var data = {userId:this.search_userId};
				this.$axios.post(url,this.$qs.stringify(data),{
					headers: {
						'Content-Type':'application/x-www-form-urlencoded; charset=UTF-8'
					}
				}).then(res=>{
					this.list = res.data;
				})
			}
		},
		mounted:function(){
			this.search();
		}
		
	}
</script>

<style>

</style>
