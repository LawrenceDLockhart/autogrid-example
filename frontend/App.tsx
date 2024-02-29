import {AutoGrid} from "@hilla/react-crud";
import {AttendeeService} from "Frontend/generated/endpoints";
import AttendeeModel from "Frontend/generated/com/example/application/model/AttendeeModel";
import {useState} from "react";
import Attendee from "Frontend/generated/com/example/application/model/Attendee";

export default function App() {
    const [selectedItems, setSelectedItems] = useState<Attendee[]>([]);
    return (
      <>
          <div className="p-l box-border">
            <h2>AutoGrid Example</h2>
            <AutoGrid service={AttendeeService} model={AttendeeModel}
                      selectedItems={selectedItems}
                      onActiveItemChanged={(e) => {
                          const item = e.detail.value;
                          setSelectedItems(item ? [item] : []);
                      }}
            />
        </div>
      </>
      )
}
