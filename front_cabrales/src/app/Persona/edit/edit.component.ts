import { Component, OnInit } from '@angular/core';
import {  Router } from '@angular/router';
import { Persona } from 'src/app/Modelo/Persona';
import { ServiceService } from 'src/app/Service/service.service';

@Component({
  selector: 'app-edit',
  templateUrl: './edit.component.html',
  styleUrls: ['./edit.component.css']
})
export class EditComponent implements OnInit {
  persona :Persona=new Persona();

  constructor(private router:Router,private service:ServiceService) { }

  ngOnInit(){
    this.Editar()
  }
  Editar(){
    let id=localStorage.getItem("id");
    if (id !== null) { // Verifica si id no es null
      this.service.getUserById(+id)
        .subscribe(data => {
          this.persona = data;
        });
    } else {
      console.error("El ID es nulo");
    }
  }
  Actualizar(persona:Persona){
    this.service.updatePersona(persona)
    .subscribe(data=>{
      this.persona=data;
      alert("Se actualizo correctamente!!!");
      this.router.navigate(["listar"]);
    })
    
  }

}
