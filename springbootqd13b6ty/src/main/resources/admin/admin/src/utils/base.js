const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootqd13b6ty/",
            name: "springbootqd13b6ty",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbootqd13b6ty/front/dist/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "雅苑小区管理系统的设计与实现"
        } 
    }
}
export default base
