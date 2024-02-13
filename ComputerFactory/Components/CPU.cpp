//
// Created by Pierf on 18/11/2023.
//
#include "CPU.h"
#include "iostream"



double CPU::getPrice() const {
    return price;
}


CPU::CPU(const CPU &other) {
    price=other.price;
}

CPU::CPU() = default;

CPU *CPU::Clone() const {
    return nullptr;
}

std::string CPU::getType() {
    return {};
}

void CPU::initialize() {

}




















