"use strict";
class Model {
    constructor() {
        this.user = "Ndumiso";
        this.items = [
            new TodoItem("Master Angular Architecture", false),
            new TodoItem("Master Spring Framework", false),
            new TodoItem("Implement my first RESTFul web service using jersey", true),
            new TodoItem("Master TypeScript", true)
        ];
    }
}
exports.Model = Model;
class TodoItem {
    constructor(action, done) {
        this.action = action;
        this.done = done;
    }
}
exports.TodoItem = TodoItem;
