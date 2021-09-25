package com.emaratech.home.entity;

import com.emaratech.home.control.HomeRepository;

public class HomeService {
    private HomeRepository homeRepo;

    public HomeService(HomeRepository homeRepo) {
        this.homeRepo = homeRepo;
    }

    public boolean isRunning() {
        return true;
    }
}
