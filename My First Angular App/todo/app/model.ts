export class Model{
    user;
    items;

    constructor(){
        this.user = "Ndumiso";
        this.items = [
            new TodoItem("Master Angular Architecture", false),
            new TodoItem("Master Spring Framework", false),
            new TodoItem("Implement my first RESTFul web service using jersey", true),
            new TodoItem("Master TypeScript", true)
        ]
    }

}

export class TodoItem{
    action;
    done;

    constructor(action, done){
        this.action = action;
        this.done = done
    }
}