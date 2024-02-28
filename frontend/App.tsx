
import {AutoGrid} from "@hilla/react-crud";
import {AttendeeService} from "Frontend/generated/endpoints";
import AttendeeModel from "Frontend/generated/com/example/application/model/AttendeeModel";

export default function App() {
  return   <AutoGrid service={AttendeeService} model={AttendeeModel}/>;
}
