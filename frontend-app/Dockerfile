FROM node:22 AS build

WORKDIR /app

COPY angular-ui/package*.json ./

RUN npm install

COPY angular-ui/ .

RUN npm run build

FROM nginx:alpine

RUN apk add --no-cache curl iputils

COPY --from=build /app/dist/angular-ui/browser /usr/share/nginx/html

EXPOSE 80

CMD ["nginx", "-g", "daemon off;"]
