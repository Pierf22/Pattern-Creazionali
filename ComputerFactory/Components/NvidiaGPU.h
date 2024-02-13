//
// Created by Pierf on 19/11/2023.
//

#ifndef COMPUTERFACTORY_NVIDIAGPU_H
#define COMPUTERFACTORY_NVIDIAGPU_H
#include "GPU.h"

class NvidiaGPU :public GPU{
public:
    NvidiaGPU(const NvidiaGPU &);
    NvidiaGPU();
    NvidiaGPU* Clone() const override;

    std::string getType() override;

    void initialize() override;

};


#endif //COMPUTERFACTORY_NVIDIAGPU_H
