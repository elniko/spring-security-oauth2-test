import { Injectable } from '@angular/core';
import {
  HttpRequest,
  HttpHandler,
  HttpEvent,
  HttpInterceptor,
  HttpResponseBase
} from '@angular/common/http';
import { Observable } from 'rxjs';
import { catchError, map, tap } from 'rxjs/operators';


//@Injectable()
export  class MyInterceptor implements HttpInterceptor {
  intercept(request: HttpRequest<any>, next: HttpHandler): Observable<HttpEvent<any>> {
    console.log("ddddddddddd",request);
    return next.handle(request).pipe(

      tap(event => {
            if (event instanceof HttpResponseBase) {
              const response = event as HttpResponseBase;
              if (response.status === 302) {
                window.location.href = 'https://www.google.com';
                return;
              }
            }
          },
        event => {
          if (event instanceof HttpResponseBase) {
            // if (response.status === 302) {
            window.location.href = 'http://localhost:8084/currentUser';
            // }
          }
        }
      )
    );
  }
}
