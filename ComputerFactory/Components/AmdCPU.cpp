//
// Created by Pierf on 18/11/2023.
//
#include "AmdCPU.h"
#include "CPU.h"




AmdCPU *AmdCPU::Clone() const {
    return new AmdCPU( *this);
}
void AmdCPU::initialize() {
    CPU::price=360;
    CPU::clock=1.2;


}
AmdCPU::AmdCPU() = default;



std::string AmdCPU::getType() {
    return "AMD";

}

AmdCPU::AmdCPU(const AmdCPU &other ): CPU(other) {

}
