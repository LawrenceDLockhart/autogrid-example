import { Button } from '@hilla/react-components/Button.js';
import { Notification } from '@hilla/react-components/Notification.js';
import { TextField } from '@hilla/react-components/TextField.js';
import { GridService } from 'Frontend/generated/endpoints.js';
import { useState } from 'react';
import {AutoGrid} from "@hilla/react-crud";

export default function HelloWorldView() {
  const [name, setName] = useState('');

  return (
    <>
      <section className="flex p-m gap-m items-end">
        <TextField
          label="Your name"
          onValueChanged={(e) => {
            setName(e.detail.value);
          }}
        />
        <Button
          onClick={async () => {
            const serverResponse = await GridService.sayHello(name);
            Notification.show(serverResponse);
          }}
        >
          Say hello
        </Button>
      </section>
        <AutoGrid service={GridService} model={AttendeeModel}/>;
    </>
  );
}
