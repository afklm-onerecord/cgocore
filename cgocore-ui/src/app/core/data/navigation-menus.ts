import { NavMenu } from '../models/nav-menu';

export const navigationMenus: NavMenu[] = [
  {
    text: 'Reference',
    links:[
      {
        text: 'Currencies',
        path: '/currency/list'
      },
      {
        text: 'Countries',
        path: '/country/list'
      },
      {
        text: 'Stations',
        path: '/station/list'
      },
      {
        text: 'Airlines',
        path: '/airline-company/list'
      },
      {
        text: 'Metrics',
        path: '/metric/list'
      },
      {
        text: 'Units of measure',
        path: '/unit-of-measure/list'
      },
      {
        text: 'Special handling codes',
        path: '/special-handling-code/list'
      }
      ,
      {
        text: 'ULD Types',
        path: '/uld-type/list'
      }
    ]
  },
  {
    text: 'Schedules',
    path: '/dated-flight/list'
  },
  {
    text: 'Air waybills',
    path: '/air-waybill/list'
  },
  {
    text: 'Bookings',
    path: '/booking/list'
  }
];
