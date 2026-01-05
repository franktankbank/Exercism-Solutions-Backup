#include <string>

namespace log_line {
std::string message(std::string line) {
    int index = line.length() - line.find(":") - 2;
    line.erase(line.begin(), line.end()-index);
    return line;
}

std::string log_level(std::string line) {
    int end = line.find("]");
    line.erase(line.begin()+end, line.end());
    int begin = line.length() - line.find("[") + -1;
    line.erase(line.begin(), line.end()-begin);
    return line;
}

std::string reformat(std::string line) {
    std::string lvl = log_level(line);
    std::string msg = message(line);
    return msg + " (" + lvl + ")";
}
}  // namespace log_line
