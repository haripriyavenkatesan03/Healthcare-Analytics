from py4j.clientserver import JavaGateway, GatewayParameters, CallbackServerParameters

class PythonEntryPoint(object):
    def predict(self, age, condition):
        return f"Predicted outcome for age {age} with condition {condition}"

if __name__ == "__main__":
    gateway = JavaGateway(
        gateway_parameters=GatewayParameters(auto_convert=True),
        callback_server_parameters=CallbackServerParameters(port=0)
    )
    gateway.entry_point = PythonEntryPoint()
    gateway.start()
