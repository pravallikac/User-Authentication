import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { P404Component } from './404.component';
import { P500Component } from './500.component';
import { LoginComponent } from './login.component';
import { RegisterComponent } from './register.component';
import {AuthGuard} from '../../auth-guard.service';

const routes: Routes = [
  {
    path: '',
    data: {
      title: 'Example Pages'
    },
    children: [
      {
        path: '404',
        canActivate: [AuthGuard],
        component: P404Component,
        data: {
          title: 'Page 404'
        }
      },
      {
        path: '500',
        canActivate: [AuthGuard],
        component: P500Component,
        data: {
          title: 'Page 500'
        }
      },
      // {
      //   path: 'register',
      //   component: RegisterComponent,
      //   data: {
      //     title: 'Register Page'
      //   }
      // }
    ]
  },
  {
    path: 'login',
    component: LoginComponent,
    data: {
      title: 'Login Page'
    }
  },
  {
    path: 'register',
    component: RegisterComponent,
    data: {
      title: 'Register Page'
    }
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class PagesRoutingModule {}
