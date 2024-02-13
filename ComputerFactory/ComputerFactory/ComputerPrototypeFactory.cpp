//
// Created by Pierf on 18/11/2023.
//

#include "ComputerPrototypeFactory.h"

ComputerPrototypeFactory::ComputerPrototypeFactory(CPU* c, GPU * g , SamsungRAM * r) {
    prototypeCpu=c;
    prototypeRam= r;
    prototypeGpu=  g;
};

 CPU* ComputerPrototypeFactory::MakeCPU() const {
     CPU* cpu1=prototypeCpu->Clone();
     cpu1->initialize();
    return cpu1;
}

GPU *ComputerPrototypeFactory::MakeGPU() const {
     GPU* gpu1=prototypeGpu->Clone();
     gpu1->initialize();
    return gpu1;
 }

SamsungRAM *ComputerPrototypeFactory::MakeRAM() const {
     SamsungRAM* samsungRam=prototypeRam->Clone();
     samsungRam->initialize();
    return samsungRam;
 }