<template>
  <a-layout style="min-height: 100vh">
    <!-- Header -->
    <a-layout-header style="background: #fff; padding: 0">
      <app-header />
    </a-layout-header>

    <!-- Main layout with sider and content -->
    <a-layout>
      <!-- Collapsible Sider with Controlled Open Keys for Nested Menu -->
      <a-layout-sider width="200px" collapsible style="background: #fff">
        <a-menu
          mode="inline"
          :openKeys="openKeys"
          @openChange="onOpenChange"
          style="height: 100%; border-right: 0"
        >
<!--          <a-sub-menu key="sub1" title="Menu 1">
            <a-menu-item key="1">Option 1</a-menu-item>
            <a-menu-item key="2">Option 2</a-menu-item>
            <a-sub-menu key="sub1-1" title="Nested Menu">
              <a-menu-item key="3">Option 3</a-menu-item>
              <a-menu-item key="4">Option 4</a-menu-item>
            </a-sub-menu>
          </a-sub-menu>
          <a-sub-menu key="sub2" title="Menu 2">
            <a-menu-item key="5">Option 5</a-menu-item>
            <a-menu-item key="6">Option 6</a-menu-item>
          </a-sub-menu>
-->>

	 
			
				<a-menu-item>
					<router-link to="/flights">
						<span class="label">Flights</span>
					</router-link>
				</a-menu-item>
		
				<a-menu-item>
					<router-link to="/airplanes">
						<span class="label">Airplanes</span>
					</router-link>
				</a-menu-item>
		
				<a-menu-item>
					<router-link to="/passengers">
						<span class="label">Passengers</span>
					</router-link>
				</a-menu-item>
		
				<a-menu-item>
					<router-link to="/tickets">
						<span class="label">Tickets</span>
					</router-link>
				</a-menu-item>
		
				<a-menu-item>
					<router-link to="/bookings">
						<span class="label">Bookings</span>
					</router-link>
				</a-menu-item>
		
				<a-menu-item>
					<router-link to="/airports">
						<span class="label">Airports</span>
					</router-link>
				</a-menu-item>
		
				<a-menu-item>
					<router-link to="/crewMembers">
						<span class="label">Crew Members</span>
					</router-link>
				</a-menu-item>
		
				<a-menu-item>
					<router-link to="/crewAssignments">
						<span class="label">Crew Assignments</span>
					</router-link>
				</a-menu-item>
		
				<a-menu-item>
					<router-link to="/schedules">
						<span class="label">Schedules</span>
					</router-link>
				</a-menu-item>
		
				<a-menu-item>
					<router-link to="/baggages">
						<span class="label">Baggages</span>
					</router-link>
				</a-menu-item>
		
				<a-menu-item>
					<router-link to="/gates">
						<span class="label">Gates</span>
					</router-link>
				</a-menu-item>
		
				<a-menu-item>
					<router-link to="/boardingPasss">
						<span class="label">Boarding Passs</span>
					</router-link>
				</a-menu-item>
		
				<a-menu-item>
					<router-link to="/loungeAccesss">
						<span class="label">Lounge Accesss</span>
					</router-link>
				</a-menu-item>
		
				<a-menu-item>
					<router-link to="/lounges">
						<span class="label">Lounges</span>
					</router-link>
				</a-menu-item>
		
				<a-menu-item>
					<router-link to="/checkins">
						<span class="label">Checkins</span>
					</router-link>
				</a-menu-item>
		
				<a-menu-item>
					<router-link to="/seats">
						<span class="label">Seats</span>
					</router-link>
				</a-menu-item>
		
				<a-menu-item>
					<router-link to="/frequentFlyers">
						<span class="label">Frequent Flyers</span>
					</router-link>
				</a-menu-item>
		
				<a-menu-item>
					<router-link to="/payments">
						<span class="label">Payments</span>
					</router-link>
				</a-menu-item>
		
				<a-menu-item>
					<router-link to="/promotions">
						<span class="label">Promotions</span>
					</router-link>
				</a-menu-item>
		
				<a-menu-item>
					<router-link to="/customerSupports">
						<span class="label">Customer Supports</span>
					</router-link>
				</a-menu-item>
		
	
        </a-menu>
      </a-layout-sider>
      
      <!-- Content area -->
      <a-layout-content style="padding: 16px">
        <router-view />
      </a-layout-content>
    </a-layout>
  </a-layout>
</template>

<script>
import { ref } from "vue";
import AppHeader from "@/components/AppHeader.vue";

export default {
  name: "DefaultLayout",
  components: {
    AppHeader,
  },
  setup() {
    const openKeys = ref(["sub1"]); // default open submenu
    const onOpenChange = (keys) => {
      // Open only the last clicked submenu, for single open behavior
      openKeys.value = keys.length ? [keys[keys.length - 1]] : [];
    };

    return {
      openKeys,
      onOpenChange,
    };
  },
};
</script>
<style>
.ant-layout {
    margin-top: 20px;
}
</style>

