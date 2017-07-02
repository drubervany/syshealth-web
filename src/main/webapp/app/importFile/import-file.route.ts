import { Route } from '@angular/router';

import { UserRouteAccessService } from '../shared';
import { ImportFileComponent } from './import-file.component';

export const importFileRoute: Route = {
    path: 'jhi-import-file',
    component: ImportFileComponent,
    data: {
        authorities: ['ROLE_USER'],
        pageTitle: 'global.menu.import'
    },
    canActivate: [UserRouteAccessService]
};
