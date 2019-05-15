<template>
	<div>
		<h1 style="text-align: center">论坛表</h1>
		<div style="text-align: left;margin:0 0 20px 50px;">
			<el-input style='width:160px' placeholder='发布时间' v-model='search_forTime'></el-input>
			<el-button @click='search'>查询</el-button>
			<el-button @click='add'>添加</el-button>
		</div>
		<center>
			<el-table :data="list">
				<el-table-column prop="forId" label="主键" width="80"></el-table-column>
				<el-table-column prop="forTime" label="发布时间" width="120"></el-table-column>
				<el-table-column prop="userId" label="发布人" width="120"></el-table-column>
				<el-table-column prop="forTheme" label="主题" width="120"></el-table-column>
				<el-table-column prop="forContent" label="内容" width="120"></el-table-column>
				<el-table-column prop="newsImage" label="图片" width="120"></el-table-column>
				<el-table-column prop="exaState" label="审核状态" width="120"></el-table-column>
				<el-table-column prop="fabulouscount" label="点赞数量" width="120"></el-table-column>
				<el-table-column prop="state" label="0、不置顶 1-5、置顶（按顺序）" width="120"></el-table-column>
				<el-table-column prop="elite" label="0、普通  1、加精" width="120"></el-table-column>
				<el-table-column label="操作" width="180">
				  <template slot-scope="scope">
					<el-button size="mini" @click="update(scope.row.forId)">编辑</el-button>
					<el-button size="mini" type='danger' @click="del(scope.row.forId)">删除</el-button>
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
				search_forTime:'',
				list:[]
			};
		},
		methods:{
			update(forId){
				this.$router.push({name:'ForumEdit',params:{forId:forId}});
			},
			del(forId){
				var url = this.baseUrl+"/forum/delete"
				var data = {forId:forId};
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
				this.$router.push("/ForumAdd");
			},
			search(){
				var url = this.baseUrl+"/forum/search"
				var data = {forTime:this.search_forTime};
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
