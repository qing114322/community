<template>
	<div>
		<h1 style="text-align: center">评论表</h1>
		<div style="text-align: left;margin:0 0 20px 50px;">
			<el-input style='width:160px' placeholder='评论人' v-model='search_userId'></el-input>
			<el-button @click='search'>查询</el-button>
			<el-button @click='add'>添加</el-button>
		</div>
		<center>
			<el-table :data="list">
				<el-table-column prop="comId" label="主键" width="80"></el-table-column>
				<el-table-column prop="userId" label="评论人" width="120"></el-table-column>
				<el-table-column prop="forId" label="评论贴" width="120"></el-table-column>
				<el-table-column prop="comContent" label="评论内容" width="120"></el-table-column>
				<el-table-column prop="comTime" label="评论时间" width="120"></el-table-column>
				<el-table-column prop="fabulouscount" label="点赞数量" width="120"></el-table-column>
				<el-table-column label="操作" width="180">
				  <template slot-scope="scope">
					<el-button size="mini" @click="update(scope.row.comId)">编辑</el-button>
					<el-button size="mini" type='danger' @click="del(scope.row.comId)">删除</el-button>
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
			update(comId){
				this.$router.push({name:'CommentEdit',params:{comId:comId}});
			},
			del(comId){
				var url = this.baseUrl+"/comment/delete"
				var data = {comId:comId};
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
				this.$router.push("/CommentAdd");
			},
			search(){
				var url = this.baseUrl+"/comment/search"
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
