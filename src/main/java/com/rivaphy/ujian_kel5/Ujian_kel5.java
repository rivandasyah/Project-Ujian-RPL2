/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.rivaphy.ujian_kel5;

import com.rivaphy.ujian_kel5.controller.BarangController;
import com.rivaphy.ujian_kel5.service.BarangService;
import com.rivaphy.ujian_kel5.view.BarangView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
/**
 *
 * @author asus
 */
@SpringBootApplication
public class Ujian_kel5 implements ApplicationRunner{

    @Autowired
    private BarangService service;

    public static void main(String[] args) {
        System.setProperty("java.awt.headless", "false");

        ApplicationContext context = SpringApplication.run(Ujian_kel5.class, args);

        BarangController controller = context.getBean(BarangController.class);
        BarangView view = new BarangView(controller);
        view.setVisible(true);
    }
    
    @Override
    public void run(ApplicationArguments args) throws Exception {
    }
}
