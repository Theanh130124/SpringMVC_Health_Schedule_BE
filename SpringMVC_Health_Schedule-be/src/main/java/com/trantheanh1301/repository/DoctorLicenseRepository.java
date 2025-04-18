/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.trantheanh1301.repository;

import com.trantheanh1301.pojo.Doctorlicense;

/**
 *
 * @author LAPTOP
 */
public interface DoctorLicenseRepository {
    public Doctorlicense registerLicense(Doctorlicense license);
    public Doctorlicense updateLicense(Doctorlicense license);
    public Doctorlicense getLicenseById(int id);
    public void removeLicense(int id);
}
