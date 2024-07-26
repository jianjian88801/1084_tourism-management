const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot99u10/",
            name: "springboot99u10",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot99u10/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "旅游管理系统"
        } 
    }
}
export default base
