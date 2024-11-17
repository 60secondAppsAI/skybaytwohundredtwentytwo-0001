import Vue from "vue";
import VueRouter from "vue-router";
import DefaultLayout from "@/layouts/DefaultLayout.vue";
import Flights from  '@/pages/Flights.vue';
import FlightDetail from  '@/pages/FlightDetail.vue';
import Airplanes from  '@/pages/Airplanes.vue';
import AirplaneDetail from  '@/pages/AirplaneDetail.vue';
import Passengers from  '@/pages/Passengers.vue';
import PassengerDetail from  '@/pages/PassengerDetail.vue';
import Tickets from  '@/pages/Tickets.vue';
import TicketDetail from  '@/pages/TicketDetail.vue';
import Bookings from  '@/pages/Bookings.vue';
import BookingDetail from  '@/pages/BookingDetail.vue';
import Airports from  '@/pages/Airports.vue';
import AirportDetail from  '@/pages/AirportDetail.vue';
import CrewMembers from  '@/pages/CrewMembers.vue';
import CrewMemberDetail from  '@/pages/CrewMemberDetail.vue';
import CrewAssignments from  '@/pages/CrewAssignments.vue';
import CrewAssignmentDetail from  '@/pages/CrewAssignmentDetail.vue';
import Schedules from  '@/pages/Schedules.vue';
import ScheduleDetail from  '@/pages/ScheduleDetail.vue';
import Baggages from  '@/pages/Baggages.vue';
import BaggageDetail from  '@/pages/BaggageDetail.vue';
import Gates from  '@/pages/Gates.vue';
import GateDetail from  '@/pages/GateDetail.vue';
import BoardingPasss from  '@/pages/BoardingPasss.vue';
import BoardingPassDetail from  '@/pages/BoardingPassDetail.vue';
import LoungeAccesss from  '@/pages/LoungeAccesss.vue';
import LoungeAccessDetail from  '@/pages/LoungeAccessDetail.vue';
import Lounges from  '@/pages/Lounges.vue';
import LoungeDetail from  '@/pages/LoungeDetail.vue';
import Checkins from  '@/pages/Checkins.vue';
import CheckinDetail from  '@/pages/CheckinDetail.vue';
import Seats from  '@/pages/Seats.vue';
import SeatDetail from  '@/pages/SeatDetail.vue';
import FrequentFlyers from  '@/pages/FrequentFlyers.vue';
import FrequentFlyerDetail from  '@/pages/FrequentFlyerDetail.vue';
import Payments from  '@/pages/Payments.vue';
import PaymentDetail from  '@/pages/PaymentDetail.vue';
import Promotions from  '@/pages/Promotions.vue';
import PromotionDetail from  '@/pages/PromotionDetail.vue';
import CustomerSupports from  '@/pages/CustomerSupports.vue';
import CustomerSupportDetail from  '@/pages/CustomerSupportDetail.vue';

Vue.use(VueRouter);

const routes = [
  {
    path: "/",
    name: "home",
    component: () => import("../views/HomeView.vue"),
			redirect: '/flights',
																				  },
  {
    path: "/pricing",
    name: "PricingView",
    component: () => import("../views/PricingView.vue"),
  },
  {
    path: "/arts-gallery",
    name: "ArtsGalleryView",
    component: () => import("../views/ArtsGalleryView.vue"),
  },
  {
    path: "/checkout/:id",
    name: "CheckoutView",
    component: () => import("../views/CheckoutView.vue"),
  },
  {
    path: "/stripe-checkout",
    name: "StripeCheckoutView",
    component: () => import("../views/StripeCheckoutView.vue"),
  },
	{
		path: '/flights',
		name: 'Flights',
		layout: DefaultLayout,
		component: Flights,
	},
	{
	    path: '/flight/:flightId', 
	    name: 'FlightDetail',
		layout: DefaultLayout,
	    component: FlightDetail,
	    props: true // Pass route params as props to the component
  	},
	{
		path: '/airplanes',
		name: 'Airplanes',
		layout: DefaultLayout,
		component: Airplanes,
	},
	{
	    path: '/airplane/:airplaneId', 
	    name: 'AirplaneDetail',
		layout: DefaultLayout,
	    component: AirplaneDetail,
	    props: true // Pass route params as props to the component
  	},
	{
		path: '/passengers',
		name: 'Passengers',
		layout: DefaultLayout,
		component: Passengers,
	},
	{
	    path: '/passenger/:passengerId', 
	    name: 'PassengerDetail',
		layout: DefaultLayout,
	    component: PassengerDetail,
	    props: true // Pass route params as props to the component
  	},
	{
		path: '/tickets',
		name: 'Tickets',
		layout: DefaultLayout,
		component: Tickets,
	},
	{
	    path: '/ticket/:ticketId', 
	    name: 'TicketDetail',
		layout: DefaultLayout,
	    component: TicketDetail,
	    props: true // Pass route params as props to the component
  	},
	{
		path: '/bookings',
		name: 'Bookings',
		layout: DefaultLayout,
		component: Bookings,
	},
	{
	    path: '/booking/:bookingId', 
	    name: 'BookingDetail',
		layout: DefaultLayout,
	    component: BookingDetail,
	    props: true // Pass route params as props to the component
  	},
	{
		path: '/airports',
		name: 'Airports',
		layout: DefaultLayout,
		component: Airports,
	},
	{
	    path: '/airport/:airportId', 
	    name: 'AirportDetail',
		layout: DefaultLayout,
	    component: AirportDetail,
	    props: true // Pass route params as props to the component
  	},
	{
		path: '/crewMembers',
		name: 'CrewMembers',
		layout: DefaultLayout,
		component: CrewMembers,
	},
	{
	    path: '/crewMember/:crewMemberId', 
	    name: 'CrewMemberDetail',
		layout: DefaultLayout,
	    component: CrewMemberDetail,
	    props: true // Pass route params as props to the component
  	},
	{
		path: '/crewAssignments',
		name: 'CrewAssignments',
		layout: DefaultLayout,
		component: CrewAssignments,
	},
	{
	    path: '/crewAssignment/:crewAssignmentId', 
	    name: 'CrewAssignmentDetail',
		layout: DefaultLayout,
	    component: CrewAssignmentDetail,
	    props: true // Pass route params as props to the component
  	},
	{
		path: '/schedules',
		name: 'Schedules',
		layout: DefaultLayout,
		component: Schedules,
	},
	{
	    path: '/schedule/:scheduleId', 
	    name: 'ScheduleDetail',
		layout: DefaultLayout,
	    component: ScheduleDetail,
	    props: true // Pass route params as props to the component
  	},
	{
		path: '/baggages',
		name: 'Baggages',
		layout: DefaultLayout,
		component: Baggages,
	},
	{
	    path: '/baggage/:baggageId', 
	    name: 'BaggageDetail',
		layout: DefaultLayout,
	    component: BaggageDetail,
	    props: true // Pass route params as props to the component
  	},
	{
		path: '/gates',
		name: 'Gates',
		layout: DefaultLayout,
		component: Gates,
	},
	{
	    path: '/gate/:gateId', 
	    name: 'GateDetail',
		layout: DefaultLayout,
	    component: GateDetail,
	    props: true // Pass route params as props to the component
  	},
	{
		path: '/boardingPasss',
		name: 'BoardingPasss',
		layout: DefaultLayout,
		component: BoardingPasss,
	},
	{
	    path: '/boardingPass/:boardingPassId', 
	    name: 'BoardingPassDetail',
		layout: DefaultLayout,
	    component: BoardingPassDetail,
	    props: true // Pass route params as props to the component
  	},
	{
		path: '/loungeAccesss',
		name: 'LoungeAccesss',
		layout: DefaultLayout,
		component: LoungeAccesss,
	},
	{
	    path: '/loungeAccess/:loungeAccessId', 
	    name: 'LoungeAccessDetail',
		layout: DefaultLayout,
	    component: LoungeAccessDetail,
	    props: true // Pass route params as props to the component
  	},
	{
		path: '/lounges',
		name: 'Lounges',
		layout: DefaultLayout,
		component: Lounges,
	},
	{
	    path: '/lounge/:loungeId', 
	    name: 'LoungeDetail',
		layout: DefaultLayout,
	    component: LoungeDetail,
	    props: true // Pass route params as props to the component
  	},
	{
		path: '/checkins',
		name: 'Checkins',
		layout: DefaultLayout,
		component: Checkins,
	},
	{
	    path: '/checkin/:checkinId', 
	    name: 'CheckinDetail',
		layout: DefaultLayout,
	    component: CheckinDetail,
	    props: true // Pass route params as props to the component
  	},
	{
		path: '/seats',
		name: 'Seats',
		layout: DefaultLayout,
		component: Seats,
	},
	{
	    path: '/seat/:seatId', 
	    name: 'SeatDetail',
		layout: DefaultLayout,
	    component: SeatDetail,
	    props: true // Pass route params as props to the component
  	},
	{
		path: '/frequentFlyers',
		name: 'FrequentFlyers',
		layout: DefaultLayout,
		component: FrequentFlyers,
	},
	{
	    path: '/frequentFlyer/:frequentFlyerId', 
	    name: 'FrequentFlyerDetail',
		layout: DefaultLayout,
	    component: FrequentFlyerDetail,
	    props: true // Pass route params as props to the component
  	},
	{
		path: '/payments',
		name: 'Payments',
		layout: DefaultLayout,
		component: Payments,
	},
	{
	    path: '/payment/:paymentId', 
	    name: 'PaymentDetail',
		layout: DefaultLayout,
	    component: PaymentDetail,
	    props: true // Pass route params as props to the component
  	},
	{
		path: '/promotions',
		name: 'Promotions',
		layout: DefaultLayout,
		component: Promotions,
	},
	{
	    path: '/promotion/:promotionId', 
	    name: 'PromotionDetail',
		layout: DefaultLayout,
	    component: PromotionDetail,
	    props: true // Pass route params as props to the component
  	},
	{
		path: '/customerSupports',
		name: 'CustomerSupports',
		layout: DefaultLayout,
		component: CustomerSupports,
	},
	{
	    path: '/customerSupport/:customerSupportId', 
	    name: 'CustomerSupportDetail',
		layout: DefaultLayout,
	    component: CustomerSupportDetail,
	    props: true // Pass route params as props to the component
  	},
];

const router = new VueRouter({
  mode: "hash",
  base: process.env.BASE_URL,
  routes,
});

export default router;
