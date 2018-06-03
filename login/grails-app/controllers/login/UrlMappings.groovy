package login

class UrlMappings {

    static mappings = {
     
        get "/$controller/$id(.$format)?"(action: "show")
        put "/$controller/$id(.$format)?"(action: "update")
        delete "/$controller/$id(.$format)?"(action: "delete")
        get "/$controller"(action: "index")
        post "/$controller(.$format)?"(action: "save")
        post "/$controller/search"(action: "search")
        get "/$controller/count"(action: "count")
        
        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
        
        // RESTService api
        "/returnUsernameAndPassword"(resources: 'userLogin')
    }
}
