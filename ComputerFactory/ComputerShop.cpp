//
// Created by Pierf on 19/11/2023.
//
#include "iostream"
#include "ComputerShop.h"
int i=1;
Computer::Computer(SamsungRAM* ram, CPU* cpu, GPU*  gpu) : ram(ram), cpu(cpu), gpu(gpu) {
    number=i++;
}



void Computer::printStats() {
    int sum=0;
    std::cout<<"Computer numero "<<number<<"\n";
    std::cout<<"CPU: "<<cpu->getType()<<" | Prezzo: "<<cpu->getPrice()<<"\n";
    std::cout<<"GPU: "<<gpu->getType()<<" | Prezzo: "<<gpu->getPrice()<<"\n";
    std::cout<<"RAM: "<<ram->getType()<<" | Prezzo: "<<ram->getPrice()<<"\n";
    sum=cpu->getPrice()+gpu->getPrice()+ram->getPrice();
    std::cout<<"Costo totale: "<<sum<<"\n";



}


Computer ComputerShop::createComputer(const ComputerPrototypeFactory & f) {
    Computer computer1(f.MakeRAM(), f.MakeCPU(), f.MakeGPU());
    return computer1;


}


