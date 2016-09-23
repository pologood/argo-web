path=`pwd`
echo "${path}"

name="$1"
echo "${name}"

namelower=$(echo $name | awk '{print tolower($0)}')

protoc --proto_path=${path} --objc_out=${path}/ios ${path}/${name}.proto
protoc --proto_path=${path} --java_out=${path}/java ${path}/${name}.proto