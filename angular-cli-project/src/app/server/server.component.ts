import { Component } from "@angular/core";

@Component(
    {
        selector: 'app-server',
        templateUrl: './server.component.html'
    }
)
export class ServerComponent {
    disAllowServer: boolean = true;
    serverId: number = 10;
    status: string = "online";
    message = '';
    userName = '';
    constructor() {
        setTimeout(() => {
            this.allow()
        }, 2000);
    }

    allow(): any {
        this.disAllowServer = false;
    }

    sayHello(): any {
        this.message = "Hello JAX-RS Jersey !"
    }

    onType(event: Event) {
        this.userName = (<HTMLInputElement>event.target).value;
    }


}
