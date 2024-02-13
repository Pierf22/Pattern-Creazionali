cmake_minimum_required(VERSION 3.26)
project(ComputerFactory)

set(CMAKE_CXX_STANDARD 17)

add_executable(ComputerFactory main.cpp
        ComputerShop.cpp
        ComputerFactory/ComputerPrototypeFactory.cpp
        Components/AmdCPU.cpp
        Components/CPU.cpp
        Components/GPU.cpp
        Components/IntelCPU.cpp
        Components/NvidiaGPU.cpp
        Components/SamsungRAM.cpp)
