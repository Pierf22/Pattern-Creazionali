//
// Created by Pierf on 19/11/2023.
//

#include "NvidiaGPU.h"

void NvidiaGPU::initialize() {
    GPU::haveRTX= true;
    GPU::price= 420;

}

std::string NvidiaGPU::getType() {
    return "Nvidia";
}

NvidiaGPU *NvidiaGPU::Clone() const {
    return new NvidiaGPU(*this);
}

NvidiaGPU::NvidiaGPU() {

}

NvidiaGPU::NvidiaGPU(const NvidiaGPU & other): GPU(other)  {

}
