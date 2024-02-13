//
// Created by Pierf on 18/11/2023.
//
#include <utility>

#include "iostream"
#include "SamsungRAM.h"

    void SamsungRAM::initialize(){

    price=50;}


    double SamsungRAM::getPrice() const {
        return price;
    }


SamsungRAM* SamsungRAM::Clone() const {
    return new SamsungRAM(*this);
}

SamsungRAM::SamsungRAM() {

}

std::string SamsungRAM::getType() {
    return "Samsung";
}

SamsungRAM::SamsungRAM(const SamsungRAM & other) {
    price=other.price;

}


