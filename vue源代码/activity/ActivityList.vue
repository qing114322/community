<template>
	<div>
		<h1 style="text-align: center">活动表</h1>
		<div style="text-align: left;margin:0 0 20px 50px;">
			<el-input style='width:160px' placeholder='发布时间' v-model='search_actTime'></el-input>
			<el-button @click='search'>查询</el-button>
			<el-button @click='add'>添加</el-button>
		</div>
		<center>
			<el-table :data="list">
				<el-table-column prop="actId" label="活动——主键" width="80"></el-table-column>
				<el-table-column prop="actTime" label="发布时间" width="120"></el-table-column>
				<el-table-column prop="actThene" label="主题" width="120"></el-table-column>
				<el-table-column prop="actContent" label="内容" width="120"></el-table-column>
				<el-table-column prop="state" label="1、正在进行 2、长期活动 3、已过期" width="120"></el-table-column>
				<el-table-column label="操作" width="180">
				  <template slot-scope="scope">
					<el-button size="mini" @click="update(scope.row.actId)">编辑</el-button>
					<el-button size="mini" type='danger' @click="del(scope.row.actId)">删除</el-button>
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
				search_actTime:'',
				list:[]
			};
		},
		methods:{
			update(actId){
				this.$router.push({name:'ActivityEdit',params:{actId:actId}});
			},
			del(actId){
				var url = this.baseUrl+"/activity/delete"
				var data = {actId:actId};
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
				this.$router.push("/ActivityAdd");
			},
			search(){
				var url = this.baseUrl+"/activity/search"
				var data = {actTime:this.search_actTime};
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
