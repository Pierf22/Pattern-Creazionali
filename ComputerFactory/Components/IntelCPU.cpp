//
// Created by Pierf on 18/11/2023.
//
#include "CPU.h"
#include "IntelCPU.h"


IntelCPU * IntelCPU::Clone() const {
    return new IntelCPU( *this);
}







IntelCPU::IntelCPU() :CPU(){

}




std::string IntelCPU::getType() {
    return "Intel";
}

void IntelCPU::initialize() {
        CPU::price=280;
        CPU::clock=1.9;



}
IntelCPU::IntelCPU(const IntelCPU &other) : CPU(other){};